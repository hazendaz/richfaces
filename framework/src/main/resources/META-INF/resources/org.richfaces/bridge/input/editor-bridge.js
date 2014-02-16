(function($, rf) {

  $.widget('rf.editorBridge', $.rf.bridgeBase, {

    _create: function() {
      this._super();

      var clientId = this.element.attr('id');
      var textarea = $(document.getElementById(clientId + 'Input'));

      textarea.editor(this.options);

      var widget = textarea.data('editor');
      this._storeWidget(widget);

      $('form').has(this.element).on('ajaxsubmit', function() {
          widget.getEditor().updateElement();
      });
    },

    _destroy: function() {
      $('form').has(this.element).off('ajaxsubmit');
    }
  });

}(RichFaces.jQuery, RichFaces));