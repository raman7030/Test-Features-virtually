.class public final Ll/ۧ᩺;
.super Ljava/lang/Object;
.source "95QI"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# instance fields
.field public final ֫:Ll/ᩳۨ;


# direct methods
.method public constructor <init>(Ll/ᩳۨ;)V
    .locals 0

    .line 3273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3274
    iput-object p1, p0, Ll/ۧ᩺;->֫:Ll/ᩳۨ;

    return-void
.end method


# virtual methods
.method public final onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    .line 163
    new-instance v0, Ll/ۘۛ;

    new-instance v1, Ll/ۡۛ;

    invoke-direct {v1, p2}, Ll/ۡۛ;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Ll/ۘۛ;-><init>(Ll/ܺۛ;)V

    .line 3281
    iget-object v1, p0, Ll/ۧ᩺;->֫:Ll/ᩳۨ;

    invoke-interface {v1, p1, v0}, Ll/ᩳۨ;->֫(Landroid/view/View;Ll/ۘۛ;)Ll/ۘۛ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    .line 3289
    :cond_1
    invoke-virtual {p1}, Ll/ۘۛ;->ᩳ()Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
