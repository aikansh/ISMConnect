
jQuery(document).ready(function() {
	
    /*
        Fullscreen background
    */
	$.backstretch("/resources/core/img/backgrounds/1.jpg");
    
    /*
        Form validation
    */
/*    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
    $('.login-form').on('submit', function(e) {
    	
    	$(this).find('input[type="text"], input[type="password"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});
    	
    });
    
    $('#registrationForm').on("change keyup", function(e) {
    	
    	$(this).find('input[type="text"], input[type="password"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).closest("div").addClass('has-error has-feedback');
    			$(this).closest("div").append('<span class="glyphicon glyphicon-remove form-control-feedback"></span>');
    		}
    		else {
    			$(this).closest("div").removeClass('has-error has-feedback')
    			$(this).closest("div").find('span').remove();
    		}
    	});
    	
    });*/
    
    
});
