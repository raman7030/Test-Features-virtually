.class public final Ll/ܽܶۧ;
.super Ljava/lang/Object;
.source "I69B"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/ᩳܶۧ;


# direct methods
.method public constructor <init>(Ll/ᩳܶۧ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܶۧ;->᩸:Ll/ᩳܶۧ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    if-ltz p3, :cond_0

    .line 45
    iget-object p1, p0, Ll/ܽܶۧ;->᩸:Ll/ᩳܶۧ;

    invoke-virtual {p1}, Ll/᩵ܶۧ;->֡֫()[Ljava/lang/CharSequence;

    move-result-object p2

    aget-object p2, p2, p3

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 46
    invoke-virtual {p1}, Ll/᩵ܶۧ;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p1, p2}, Ll/֫᩸ۧ;->֫(Ljava/io/Serializable;)V

    .line 47
    invoke-virtual {p1, p2}, Ll/᩵ܶۧ;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
