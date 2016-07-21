package jlexdev.com.tabsmd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by JLex on 11/07/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter{
    /* */
    int numTabs;
    /* */
    public ViewPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }
    /**
    private final ArrayList<Fragment> fragments = new ArrayList<>(); // Lista de Fragments de las Tabs
    private final ArrayList<String> tabTitles = new ArrayList<>();   // Lista de Títulos de las Tabs


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // Agrego Fragments
    public void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        tabTitles.add(title);
    }

*/
    @Override
    public Fragment getItem(int position) {
        /* */
        switch (position){
            case 0:
                OneFragment tab1 = new OneFragment();
                return tab1;
            case 1:
                TwoFragment tab2 = new TwoFragment();
                return tab2;
            case 2:
                ThreeFragment tab3 = new ThreeFragment();
                return tab3;
            default:
                return null;
        }
        /**return fragments.get(position);*/
    }

    @Override
    public int getCount() {
        /* */
        return numTabs;
        /**return tabTitles.size();*/
    }



/**
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);


    }


*/

}
