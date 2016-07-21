package jlexdev.com.tabsmd;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 *  FUente:
 *  http://www.androidhive.info/2015/09/android-material-design-working-with-tabs/
 *  https://www.youtube.com/watch?v=8FiSyswS6RI
 *  http://www.materialdoc.com/tabs/
 *
 *  http://www.truiton.com/2015/06/android-tabs-example-fragments-viewpager/
 */
public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private ViewPagerAdapter adapter;

    /** Add icons
    private int[] tabIcons = {
            R.drawable.ic_watch,
            R.drawable.ic_like,
            R.drawable.ic_error
    }; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    // Inicializo mis Views
    private void initViews() {
        // Toolbar
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //  getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Mostrar "Back"
        //  getSupportActionBar().setTitle("Woops");               // Asigno Título

        // Tabs
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);//i love u



        tabLayout.addTab(tabLayout.newTab().setText("ONE"));
        tabLayout.addTab(tabLayout.newTab().setText("TWO"));
        tabLayout.addTab(tabLayout.newTab().setText("THREE"));





        /* ¿?¿?
        tabLayout.setTabTextColors(getResources()
                .getColorStateList(R.color.blanco));   */          // ¿Color Texto Tabs?

        // ViewPager
        viewPager = (ViewPager)findViewById(R.id.view_pager);
/*        setupViewPager(viewPager); */



        /* */
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(
                new TabLayout.TabLayoutOnPageChangeListener(tabLayout)); // Cambie Tab al hacer Swipe
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




        /** Add icons
        setupTabIcons(); */
    }
/*
    // Método viewPager
    private void setupViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");

        viewPager.setAdapter(adapter);
    }

*/
    /** Método para Agregar Iconos
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    } */

}
