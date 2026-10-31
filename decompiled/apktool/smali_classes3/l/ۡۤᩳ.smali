.class public final Ll/ۡۤᩳ;
.super Ljava/lang/Object;
.source "V8VP"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ۘۤᩳ;


# direct methods
.method public constructor <init>(Ll/ۘۤᩳ;)V
    .locals 0

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۤᩳ;->᩸:Ll/ۘۤᩳ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 310
    iget-object p1, p0, Ll/ۡۤᩳ;->᩸:Ll/ۘۤᩳ;

    invoke-virtual {p1}, Ll/ۘۤᩳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 311
    invoke-static {p1}, Ll/ۘۤᩳ;->ܿ(Ll/ۘۤᩳ;)Ll/֨ۧܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 312
    invoke-static {p1}, Ll/ۘۤᩳ;->ܳ(Ll/ۘۤᩳ;)Ll/֨ۧܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۧܿ;->ۜ()V

    .line 313
    invoke-static {p1}, Ll/ۘۤᩳ;->᩻(Ll/ۘۤᩳ;)Ll/֨ۚۢ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 314
    invoke-static {p1}, Ll/ۘۤᩳ;->᩻(Ll/ۘۤᩳ;)Ll/֨ۚۢ;

    move-result-object p1

    const-wide/16 v2, 0x64

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
