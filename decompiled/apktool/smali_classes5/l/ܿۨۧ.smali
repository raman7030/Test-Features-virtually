.class public final Ll/ܿۨۧ;
.super Ll/ᩳۨۧ;
.source "K5ZM"


# instance fields
.field public final synthetic ֫:Ll/ܳۨۧ;

.field public final synthetic ۧ:Ll/ۖ᩵;


# direct methods
.method public constructor <init>(Ll/ܳۨۧ;Ll/ۖ᩵;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 286
    iput-object p1, p0, Ll/ܿۨۧ;->֫:Ll/ܳۨۧ;

    iput-object p2, p0, Ll/ܿۨۧ;->ۧ:Ll/ۖ᩵;

    return-void
.end method


# virtual methods
.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 3

    .line 289
    iget-object v0, p0, Ll/ܿۨۧ;->֫:Ll/ܳۨۧ;

    iget-object v0, v0, Ll/ܳۨۧ;->᩸:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    .line 369
    iget-object v2, p0, Ll/ܿۨۧ;->ۧ:Ll/ۖ᩵;

    invoke-virtual {v2, v0, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 289
    check-cast v0, Ljava/util/ArrayList;

    .line 290
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 291
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method
