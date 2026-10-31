.class public final Ll/ۗܿܿ;
.super Ll/֡ܽ;
.source "4AWI"


# instance fields
.field public final synthetic ᩳ:Ll/֡ܳܿ;


# direct methods
.method public constructor <init>(Ll/֡ܳܿ;)V
    .locals 0

    .line 172
    iput-object p1, p0, Ll/ۗܿܿ;->ᩳ:Ll/֡ܳܿ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 175
    iget-object v0, p0, Ll/ۗܿܿ;->ᩳ:Ll/֡ܳܿ;

    invoke-static {v0}, Ll/֡ܳܿ;->ۧ(Ll/֡ܳܿ;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 176
    invoke-virtual {v0, v1}, Ll/֡ܳܿ;->֫(Z)V

    return-void

    .line 178
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
