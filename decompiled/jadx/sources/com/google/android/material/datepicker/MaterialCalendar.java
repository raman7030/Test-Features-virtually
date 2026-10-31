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
import l.AbstractC7201;
import l.AbstractC9606;
import l.C10220;
import l.C13132;
import l.C14369;
import l.C15813;
import l.C16445;
import l.C16486;
import l.C17648;
import l.C18490;
import l.C19373;
import l.C20754;
import l.C21354;
import l.C21600;
import l.C23575;
import l.C3820;
import l.C6495;
import l.C9465;

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
    public C13132 recyclerView;
    public int themeResId;
    public View yearFrame;
    public C13132 yearSelector;
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

    @Override // l.ComponentCallbacksC9205
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    @Override // l.ComponentCallbacksC9205
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

    @Override // l.ComponentCallbacksC9205
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i = C15813.f48798;
            i2 = 1;
        } else {
            i = C15813.f48816;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        viewInflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(C20754.f66877);
        C17648.m41309(gridView, new C16445() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // l.C16445
            public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
                super.onInitializeAccessibilityNodeInfo(view, c14369);
                c14369.m34284((C16486) null);
            }
        });
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new DaysOfWeekAdapter(firstDayOfWeek) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(start.daysInWeek);
        gridView.setEnabled(false);
        this.recyclerView = (C13132) viewInflate.findViewById(C20754.f67158);
        this.recyclerView.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // l.C6495
            public void calculateExtraLayoutSpace(C21600 c21600, int[] iArr) {
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
        int integer = contextThemeWrapper.getResources().getInteger(C9465.f28703);
        C13132 c13132 = (C13132) viewInflate.findViewById(C20754.f66853);
        this.yearSelector = c13132;
        if (c13132 != null) {
            c13132.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new C21354(contextThemeWrapper, integer));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (viewInflate.findViewById(C20754.f67074) != null) {
            addActionsToMonthNavigation(viewInflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new C18490().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.getPosition(this.current));
        setUpForAccessibility();
        return viewInflate;
    }

    private void setUpForAccessibility() {
        C17648.m41309(this.recyclerView, new C16445() { // from class: com.google.android.material.datepicker.MaterialCalendar.4
            @Override // l.C16445
            public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
                super.onInitializeAccessibilityNodeInfo(view, c14369);
                c14369.m34313(false);
            }
        });
    }

    private AbstractC7201 createItemDecoration() {
        return new AbstractC7201() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            public final Calendar startItem = UtcDates.getUtcCalendar();
            public final Calendar endItem = UtcDates.getUtcCalendar();

            @Override // l.AbstractC7201
            public void onDraw(Canvas canvas, C13132 c13132, C21600 c21600) {
                int width;
                if ((c13132.getAdapter() instanceof YearGridAdapter) && (c13132.getLayoutManager() instanceof C21354)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) c13132.getAdapter();
                    C21354 c21354 = (C21354) c13132.getLayoutManager();
                    for (C10220 c10220 : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                        Object obj = c10220.f30697;
                        Object obj2 = c10220.f30698;
                        if (obj != null && obj2 != null) {
                            this.startItem.setTimeInMillis(((Long) obj).longValue());
                            this.endItem.setTimeInMillis(((Long) obj2).longValue());
                            int positionForYear = yearGridAdapter.getPositionForYear(this.startItem.get(1));
                            int positionForYear2 = yearGridAdapter.getPositionForYear(this.endItem.get(1));
                            View viewFindViewByPosition = c21354.findViewByPosition(positionForYear);
                            View viewFindViewByPosition2 = c21354.findViewByPosition(positionForYear2);
                            int iM48391 = positionForYear / c21354.m48391();
                            int iM48392 = positionForYear2 / c21354.m48391();
                            for (int i = iM48391; i <= iM48392; i++) {
                                View viewFindViewByPosition3 = c21354.findViewByPosition(c21354.m48391() * i);
                                if (viewFindViewByPosition3 != null) {
                                    int top = viewFindViewByPosition3.getTop() + MaterialCalendar.this.calendarStyle.year.getTopInset();
                                    int bottom = viewFindViewByPosition3.getBottom() - MaterialCalendar.this.calendarStyle.year.getBottomInset();
                                    int width2 = (i != iM48391 || viewFindViewByPosition == null) ? 0 : (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft();
                                    if (i == iM48392 && viewFindViewByPosition2 != null) {
                                        width = (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft();
                                    } else {
                                        width = c13132.getWidth();
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
        return context.getResources().getDimensionPixelSize(C23575.f75927);
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
        final MaterialButton materialButton = (MaterialButton) view.findViewById(C20754.f67074);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        C17648.m41309(materialButton, new C16445() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // l.C16445
            public void onInitializeAccessibilityNodeInfo(View view2, C14369 c14369) {
                String string;
                super.onInitializeAccessibilityNodeInfo(view2, c14369);
                if (MaterialCalendar.this.dayFrame.getVisibility() == 0) {
                    string = MaterialCalendar.this.getString(C3820.f12221);
                } else {
                    string = MaterialCalendar.this.getString(C3820.f12177);
                }
                c14369.m34282(string);
            }
        });
        View viewFindViewById = view.findViewById(C20754.f66948);
        this.monthPrev = viewFindViewById;
        viewFindViewById.setTag(NAVIGATION_PREV_TAG);
        View viewFindViewById2 = view.findViewById(C20754.f67229);
        this.monthNext = viewFindViewById2;
        viewFindViewById2.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(C20754.f66853);
        this.dayFrame = view.findViewById(C20754.f67098);
        setSelector(CalendarSelector.DAY);
        materialButton.setText(this.current.getLongName());
        this.recyclerView.addOnScrollListener(new AbstractC9606() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // l.AbstractC9606
            public void onScrolled(C13132 c13132, int i, int i2) {
                int iFindLastVisibleItemPosition;
                if (i < 0) {
                    iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findFirstVisibleItemPosition();
                } else {
                    iFindLastVisibleItemPosition = MaterialCalendar.this.getLayoutManager().findLastVisibleItemPosition();
                }
                MaterialCalendar.this.current = monthsPagerAdapter.getPageMonth(iFindLastVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.getPageTitle(iFindLastVisibleItemPosition));
            }

            @Override // l.AbstractC9606
            public void onScrollStateChanged(C13132 c13132, int i) {
                if (i == 0) {
                    c13132.announceForAccessibility(materialButton.getText());
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
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C23575.f76134) + resources.getDimensionPixelOffset(C23575.f75876) + resources.getDimensionPixelSize(C23575.f76442);
        int dimensionPixelSize = resources.getDimensionPixelSize(C23575.f75810);
        int i = MonthAdapter.MAXIMUM_WEEKS;
        return C19373.m44633(dimensionPixelOffset, dimensionPixelSize, (resources.getDimensionPixelOffset(C23575.f76230) * (i - 1)) + (resources.getDimensionPixelSize(C23575.f75927) * i), resources.getDimensionPixelOffset(C23575.f75667));
    }

    public C6495 getLayoutManager() {
        return (C6495) this.recyclerView.getLayoutManager();
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }
}
