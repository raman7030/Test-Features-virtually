.class public final synthetic Ll/ܶᩴܿ;
.super Ljava/lang/Object;
.source "014Z"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/Spinner;

.field public final synthetic ᩸:Ll/ۗᩴܿ;

.field public final synthetic ᩹:Landroid/widget/Spinner;


# direct methods
.method public synthetic constructor <init>(Ll/ۗᩴܿ;Landroid/widget/Spinner;Landroid/widget/Spinner;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶᩴܿ;->᩸:Ll/ۗᩴܿ;

    iput-object p2, p0, Ll/ܶᩴܿ;->᩹:Landroid/widget/Spinner;

    iput-object p3, p0, Ll/ܶᩴܿ;->᩶:Landroid/widget/Spinner;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ܶᩴܿ;->᩹:Landroid/widget/Spinner;

    iget-object v0, p0, Ll/ܶᩴܿ;->᩶:Landroid/widget/Spinner;

    iget-object v1, p0, Ll/ܶᩴܿ;->᩸:Ll/ۗᩴܿ;

    invoke-static {v1, p1, v0}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Landroid/widget/Spinner;Landroid/widget/Spinner;)V

    return-void
.end method
