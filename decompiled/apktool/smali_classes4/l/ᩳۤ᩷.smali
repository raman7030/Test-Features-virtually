.class public final synthetic Ll/ᩳۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᩸:[Z


# direct methods
.method public synthetic constructor <init>([Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۤ᩷;->᩸:[Z

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 2
    sget p1, Ll/ܿۛ᩷;->ۛۧ:I

    .line 1502
    iget-object p1, p0, Ll/ᩳۤ᩷;->᩸:[Z

    aget-boolean p4, p1, p3

    xor-int/lit8 p4, p4, 0x1

    .line 1503
    aput-boolean p4, p1, p3

    .line 1504
    check-cast p2, Landroid/widget/CheckedTextView;

    invoke-virtual {p2, p4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    return-void
.end method
