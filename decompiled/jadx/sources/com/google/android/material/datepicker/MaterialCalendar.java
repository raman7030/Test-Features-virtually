package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p067l.AbstractC11498;
import p067l.AbstractC9212;
import p067l.C11364;
import p067l.C1349;
import p067l.C14849;
import p067l.C1555;
import p067l.C1658;
import p067l.C1660;
import p067l.C1717;
import p067l.C17397;
import p067l.C19941;
import p067l.C20780;
import p067l.C22093;
import p067l.C22663;
import p067l.C22897;
import p067l.C24774;
import p067l.C5999;
import p067l.C8541;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendar extends PickerFragment {
    public static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    public static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    public static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    public static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    public static final int SMOOTH_SCROLL_MAX = 3;
    public static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    public CalendarConstraints calendarConstraints;
    public CalendarSelector calendarSelector;
    public CalendarStyle calendarStyle;
    public Month current;
    public DateSelector dateSelector;
    public View dayFrame;
    public DayViewDecorator dayViewDecorator;
    public View monthNext;
    public View monthPrev;
    public C14849 recyclerView;
    public int themeResId;
    public View yearFrame;
    public C14849 yearSelector;
    public static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    public static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    public static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    public static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: loaded from: classes.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnDayClickListener {
        void onDayClick(long j);
    }

    public static MaterialCalendar newInstance(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i, calendarConstraints, null);
    }

    public static MaterialCalendar newInstance(DateSelector dateSelector, int i, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    @Override // p067l.ComponentCallbacksC11117
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt("THEME_RES_ID_KEY");
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.current = (Month) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // p067l.ComponentCallbacksC11117
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = C17397.f51936;
            i2 = 1;
        } else {
            i = C17397.f51954;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(C22093.f69561);
        C1717.m43555(gridView, new C1658() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // p067l.C1658
            public void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
                super.onInitializeAccessibilityNodeInfo(view, c1555);
                c1555.m36417((C1660) null);
            }
        });
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new DaysOfWeekAdapter(firstDayOfWeek) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (C14849) viewInflate.findViewById(C22093.f69842);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // p067l.C8541
            public void calculateExtraLayoutSpace(C22897 c22897, int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                    iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
                } else {
                    iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                    iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
                }
            }
        });
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j)) {
                    MaterialCalendar.this.dateSelector.select(j);
                    Iterator it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                    while (it.hasNext()) {
                        ((OnSelectionChangedListener) it.next()).onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                    }
                    MaterialCalendar.this.recyclerView.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.yearSelector != null) {
                        MaterialCalendar.this.yearSelector.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C11364.f31652);
        C14849 c14849 = (C14849) viewInflate.findViewById(C22093.f69537);
        this.yearSelector = c14849;
        if (c14849 != null) {
            c14849.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new C22663(contextThemeWrapper, integer));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (viewInflate.findViewById(C22093.f69758) != null) {
            addActionsToMonthNavigation(viewInflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new C19941().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        setUpForAccessibility();
        return viewInflate;
    }

    private void setUpForAccessibility() {
        C1717.m43555(this.recyclerView, new C1658() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // p067l.C1658
            public void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
                super.onInitializeAccessibilityNodeInfo(view, c1555);
                c1555.m36446(false);
            }
        });
    }

    private AbstractC9212 createItemDecoration() {
        return new AbstractC9212() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            public final Calendar startItem = UtcDates.getUtcCalendar();
            public final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // p067l.AbstractC9212
            public void onDraw(Canvas canvas, C14849 c14849, C22897 c22897) {
                int width;
                if ((c14849.getAdapter() instanceof YearGridAdapter) && (c14849.getLayoutManager() instanceof C22663)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) c14849.getAdapter();
                    C22663 c22663 = (C22663) c14849.getLayoutManager();
                    for (C1349 c1349 : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        Object obj = c1349.f33658;
                        Object obj2 = c1349.f33659;
                        if (obj != null && obj2 != null) {
                            this.startItem.setTimeInMillis(((Long) obj).longValue());
                            this.endItem.setTimeInMillis(((Long) obj2).longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View viewFindViewByPosition = c22663.findViewByPosition(positionForYear);
                            View viewFindViewByPosition2 = c22663.findViewByPosition(positionForYear2);
                            int iM50726 = positionForYear / c22663.m50726();
                            int iM50727 = positionForYear2 / c22663.m50726();
                            for (int i = iM50726; i <= iM50727; i++) {
                                View viewFindViewByPosition3 = c22663.findViewByPosition(c22663.m50726() * i);
                                if (viewFindViewByPosition3 != null) {
                                    int top = viewFindViewByPosition3.getTop() + MaterialCalendar.this.calendarStyle.year.getTopInset();
                                    int bottom = viewFindViewByPosition3.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    int width2 = (i != iM50726 || viewFindViewByPosition == null) ? 0 : (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft();
                                    if (i == iM50727 && viewFindViewByPosition2 != null) {
                                        width = (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft();
                                    } else {
                                        width = c14849.getWidth();
                                    }
                                    canvas.drawRect(width2, top, width, bottom, MaterialCalendar.this.calendarStyle.rangeFill);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    public Month getCurrentMonth() {
        return this.current;
    }

    public CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    public void setCurrentMonth(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int position = monthsPagerAdapter.getPosition(month);
        int position2 = position - monthsPagerAdapter.getPosition(this.current);
        boolean z = Math.abs(position2) > 3;
        boolean z2 = position2 > 0;
        this.current = month;
        if (z && z2) {
            this.recyclerView.scrollToPosition(position - 3);
            postSmoothRecyclerViewScroll(position);
        } else if (z) {
            this.recyclerView.scrollToPosition(position + 3);
            postSmoothRecyclerViewScroll(position);
        } else {
            postSmoothRecyclerViewScroll(position);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public DateSelector getDateSelector() {
        return this.dateSelector;
    }

    public CalendarStyle getCalendarStyle() {
        return this.calendarStyle;
    }

    public static int getDayHeight(Context context) {
        return context.getResources().getDimensionPixelSize(C24774.f78673);
    }

    public void setSelector(CalendarSelector calendarSelector) {
        this.calendarSelector = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).getPositionForYear(this.current.year));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    public void toggleVisibleSelector() {
        CalendarSelector calendarSelector = this.calendarSelector;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            setSelector(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            setSelector(calendarSelector2);
        }
    }

    private void addActionsToMonthNavigation(View view, final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(C22093.f69758);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        C1717.m43555(materialButton, new C1658() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // p067l.C1658
            public void onInitializeAccessibilityNodeInfo(View view2, C1555 c1555) {
                String string;
                super.onInitializeAccessibilityNodeInfo(view2, c1555);
                if (MaterialCalendar.this.dayFrame.getVisibility() == 0) {
                    string = MaterialCalendar.this.getString(C5999.f15028);
                } else {
                    string = MaterialCalendar.this.getString(C5999.f14984);
                }
                c1555.m36415(string);
            }
        });
        View viewFindViewById = view.findViewById(C22093.f69632);
        this.monthPrev = viewFindViewById;
        viewFindViewById.setTag(NAVIGATION_PREV_TAG);
        View viewFindViewById2 = view.findViewById(C22093.f69913);
        this.monthNext = viewFindViewById2;
        viewFindViewById2.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(C22093.f69537);
        this.dayFrame = view.findViewById(C22093.f69782);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new AbstractC11498() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // p067l.AbstractC11498
            public void onScrolled(C14849 c14849, int i, int i2) {
                int iFindLastVisibleItemPosition;
                if (i < 0) {
                    iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition();
                } else {
                    iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                }
                MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(iFindLastVisibleItemPosition));
            }

            @Override // p067l.AbstractC11498
            public void onScrollStateChanged(C14849 c14849, int i) {
                if (i == 0) {
                    c14849.announceForAccessibility(materialButton.getText());
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.toggleVisibleSelector();
            }
        });
        this.monthNext.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindFirstVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
                if (iFindFirstVisibleItemPosition < MaterialCalendar.this.recyclerView.getAdapter().getItemCount()) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindFirstVisibleItemPosition));
                }
            }
        });
        this.monthPrev.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition() - 1;
                if (iFindLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.setCurrentMonth(monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition));
                }
            }
        });
    }

    private void postSmoothRecyclerViewScroll(final int i) {
        this.recyclerView.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.recyclerView.smoothScrollToPosition(i);
            }
        });
    }

    public static int getDialogPickerHeight(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C24774.f78880) + resources.getDimensionPixelOffset(C24774.f78622) + resources.getDimensionPixelSize(C24774.f79188);
        int dimensionPixelSize = resources.getDimensionPixelSize(C24774.f78556);
        int i = MonthAdapter.MAXIMUM_WEEKS;
        return C20780.m46927(dimensionPixelOffset, dimensionPixelSize, (resources.getDimensionPixelOffset(C24774.f78976) * (i - 1)) + (resources.getDimensionPixelSize(C24774.f78673) * i), resources.getDimensionPixelOffset(C24774.f78413));
    }

    public C8541 getLayoutManager() {
        return (C8541) this.recyclerView.getLayoutManager();
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }
}
