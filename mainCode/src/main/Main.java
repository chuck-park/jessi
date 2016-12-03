package main;
import java.io.*;
import java.util.*;

import view.*;
// 프로그램 실행후에 재실행시 selectlist.txt 지워야함
//( 입력할때마다 과목 선택을 하기위해 txt 파일 덮어쓰기가 아닌 이어쓰기를 했습니다.)
public class Main {
	public static void main(String[] args) throws IOException {
	  
		  Scanner scanner = new Scanner(System.in);
//		LoginView loginView = new LoginView();
//		boolean result = loginView.login();
		  
		  InitPanel initPanel = new InitPanel();
			TypeView typeView = new TypeView();
			typeView.showTypeList();
			typeView.getTypeID(scanner);
			IngredientView ingredientView = new IngredientView();
			ingredientView.clearSelectlist(); // 기존 selectlist.txt 초기화
			ingredientView.selectIngredient(scanner); // view->control->entity(valueObject형태로)
			RecipeView recipeView = new RecipeView();
			recipeView.search();
	}
}
