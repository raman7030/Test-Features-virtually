.class public final Ll/ۢۨۧ;
.super Ll/ᩳۨۧ;
.source "A5H1"


# instance fields
.field public final synthetic ֫:Ll/ܽۨۧ;


# direct methods
.method public constructor <init>(Ll/ܽۨۧ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 498
    iput-object p1, p0, Ll/ۢۨۧ;->֫:Ll/ܽۨۧ;

    return-void
.end method


# virtual methods
.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 1

    .line 501
    iget-object v0, p0, Ll/ۢۨۧ;->֫:Ll/ܽۨۧ;

    invoke-virtual {v0}, Ll/ܽۨۧ;->runAnimators()V

    .line 502
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method
