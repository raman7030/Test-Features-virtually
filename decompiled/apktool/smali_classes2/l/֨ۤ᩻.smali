.class public final synthetic Ll/֨ۤ᩻;
.super Ljava/lang/Object;
.source "M6WW"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Ll/۠ۤ᩻;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۤ᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۤ᩻;->᩸:Ll/۠ۤ᩻;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 340
    iget-object p1, p0, Ll/֨ۤ᩻;->᩸:Ll/۠ۤ᩻;

    iget-object v0, p1, Ll/۠ۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p2

    invoke-static {v0, p2}, Ll/ܶۤ᩻;->ۧ(Ll/ܶۤ᩻;I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 341
    invoke-static {v0}, Ll/ܶۤ᩻;->ܽ(Ll/ܶۤ᩻;)Ll/֫ۗۧ;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
