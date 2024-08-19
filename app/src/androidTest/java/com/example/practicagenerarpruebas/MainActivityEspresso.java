package com.example.practicagenerarpruebas;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityEspresso {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /**
     * Funcion de TEST para la funcion que convierte de Millas a Kilómetros
     */
    @Test
    public void MaK() {
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("1"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("1,61")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("160,93")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("32,19")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("-160,93")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("12,87")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("Texto"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("Error")));
    }

    /**
     * Funcion de TEST para la funcion que convierte de Kilómetros a Millas
     */
    @Test
    public void KaM(){
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("1.60934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("1,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("100,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("32.1869"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("20,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("-160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("-100,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("12.8748"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("8,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("Texto"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button2)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("Error")));
    }
    /**
     * Funcion de TEST para la funcion que convierte de Celsius a Fahrenheit
     */
    @Test
    public void CaF(){
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("0"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("32,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("212,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("68,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("-148,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("46,40")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("Texto"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button3)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("Error")));
    }
    /**
     * Funcion de TEST para la funcion que convierte de Fahrenheit a Celsius
     */
    @Test
    public void FaC(){
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("32"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("0,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("212"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("100,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("68"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("20,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("-148"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("-100,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("46.4"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("8,00")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("Texto"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button4)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("Error")));
    }
    /**
     * Funcion de TEST para la funcion que convierte de KB a MB
     */
    @Test
    public void KBaMB(){
        Espresso.onView(withId(R.id.editTextNumero)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("0")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("1024"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("1")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("2048"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("2")));
        Espresso.onView(withId(R.id.editTextNumero)).perform(replaceText("9216"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.button5)).perform(click());
        Espresso.onView(withId(R.id.resultado)).check(matches(withText("9")));
    }
}
