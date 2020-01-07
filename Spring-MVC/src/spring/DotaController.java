package spring;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dota")
@Controller
public class DotaController {

	@RequestMapping("/form")
	public String RedirectToForm(Model model) {
		model.addAttribute("dota2", new Dota2());
		return "dotaForm";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}
	
	@RequestMapping("confirmMe")
	public String redirectToConfirmPage(@Valid @ModelAttribute("dota2") Dota2 dota, BindingResult bindingData) {
		System.out.println(bindingData);
		if(bindingData.hasErrors()) {
			return "dotaForm";
		} else {
			return "cofirmPageOfDota";	
		}
		
	}
}
