.class public final Ll/ۧۖ;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/ۢۖ;


# direct methods
.method public constructor <init>(Ll/ۢۖ;)V
    .locals 0

    .line 1185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۖ;->᩸:Ll/ۢۖ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    const/4 p1, -0x1

    if-eq p3, p1, :cond_0

    .line 1191
    iget-object p1, p0, Ll/ۧۖ;->᩸:Ll/ۢۖ;

    iget-object p1, p1, Ll/ۢۖ;->۫:Ll/۫ܺ;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 1194
    invoke-virtual {p1, p2}, Ll/۫ܺ;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
