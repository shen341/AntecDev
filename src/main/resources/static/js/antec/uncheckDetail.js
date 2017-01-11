/**
 * 
 */
$(document).ready(function() {
	
	pageSetUp();
	
	/**
	 * http://ginpen.com/2013/05/07/jquery-ajax-form/
	 * form submit use ajax
	 */
	$('form[name="formDataCheck"]').submit(function(event){
		//Cancel HTML submit 
		event.preventDefault();
		//Get this form object
		var $form=$(this);
		
		
		
	});

})