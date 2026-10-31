.class public final Ll/֫᩻᩻;
.super Ljava/lang/Object;
.source "28AQ"

# interfaces
.implements Ll/᩹᩸ܿ;


# instance fields
.field public final synthetic ᩶:Ll/ۙ֡ܿ;

.field public final synthetic ᩸:Ll/ۧ᩻᩻;

.field public final synthetic ᩹:Ll/֨ۡ᩻;


# direct methods
.method public constructor <init>(Ll/ۧ᩻᩻;Ll/֨ۡ᩻;Ll/ۙ֡ܿ;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫᩻᩻;->᩸:Ll/ۧ᩻᩻;

    iput-object p2, p0, Ll/֫᩻᩻;->᩹:Ll/֨ۡ᩻;

    iput-object p3, p0, Ll/֫᩻᩻;->᩶:Ll/ۙ֡ܿ;

    return-void
.end method


# virtual methods
.method public final ֫(JJJJ)V
    .locals 0

    .line 111
    iget-object p3, p0, Ll/֫᩻᩻;->᩸:Ll/ۧ᩻᩻;

    invoke-static {p3}, Ll/ۧ᩻᩻;->ۧ(Ll/ۧ᩻᩻;)Ll/ܶ۬ܳ;

    move-result-object p4

    invoke-virtual {p4, p1, p2}, Ll/᩷۫ܳ;->֫(J)V

    .line 112
    invoke-static {p3}, Ll/ۧ᩻᩻;->ۧ(Ll/ۧ᩻᩻;)Ll/ܶ۬ܳ;

    move-result-object p1

    iget-object p2, p0, Ll/֫᩻᩻;->᩹:Ll/֨ۡ᩻;

    invoke-interface {p2, p1}, Ll/֨ۡ᩻;->֫(Ll/᩷۫ܳ;)V

    .line 113
    invoke-interface {p2, p7, p8}, Ll/֨ۡ᩻;->ۧ(J)V

    .line 114
    invoke-static {p3}, Ll/ۧ᩻᩻;->ۧ(Ll/ۧ᩻᩻;)Ll/ܶ۬ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩷۫ܳ;->ܽ()I

    move-result p1

    invoke-interface {p2, p1}, Ll/֨ۡ᩻;->setProgress(I)V

    return-void
.end method

.method public final ܺ֫()Ll/ۙ֡ܿ;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/֫᩻᩻;->᩶:Ll/ۙ֡ܿ;

    return-object v0
.end method

.method public final ᩷֫()V
    .locals 2

    .line 129
    iget-object v0, p0, Ll/֫᩻᩻;->᩸:Ll/ۧ᩻᩻;

    invoke-static {v0}, Ll/ۧ᩻᩻;->ܽ(Ll/ۧ᩻᩻;)Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 131
    iget-object v1, p0, Ll/֫᩻᩻;->᩹:Ll/֨ۡ᩻;

    invoke-interface {v1, v0}, Ll/֨ۡ᩻;->setName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 119
    iget-object v0, p0, Ll/֫᩻᩻;->᩸:Ll/ۧ᩻᩻;

    invoke-static {v0}, Ll/ۧ᩻᩻;->֫(Ll/ۧ᩻᩻;)Ll/ܰܳ᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܰܳ᩻;->᩻()Z

    move-result v0

    return v0
.end method
