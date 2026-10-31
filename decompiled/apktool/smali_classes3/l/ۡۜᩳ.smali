.class public final synthetic Ll/ۡۜᩳ;
.super Ljava/lang/Object;
.source "T5WJ"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᩸:[Z


# direct methods
.method public synthetic constructor <init>([Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۜᩳ;->᩸:[Z

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 118
    iget-object p1, p0, Ll/ۡۜᩳ;->᩸:[Z

    aget-boolean p4, p1, p3

    xor-int/lit8 p5, p4, 0x1

    aput-boolean p5, p1, p3

    if-nez p4, :cond_0

    .line 119
    sget p1, Ll/᩹֡᩷;->ܺ:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method
