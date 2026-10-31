.class public abstract Ll/ۧۛ֨;
.super Ljava/lang/Object;
.source "M43N"

# interfaces
.implements Ll/ۚ֨֨;


# instance fields
.field public final synthetic ᩸:Ll/ۜۨ֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;)V
    .locals 0

    .line 1020
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧۛ֨;->᩸:Ll/ۜۨ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨֨֨;)V
    .locals 3

    .line 1024
    iget-object v0, p1, Ll/֨֨֨;->ܰ:Ljava/util/ArrayDeque;

    new-instance v1, Ll/᩻ۨ֨;

    iget-object v2, p0, Ll/ۧۛ֨;->᩸:Ll/ۜۨ֨;

    invoke-direct {v1, v2, p1}, Ll/᩻ۨ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/֨֨֨;Ll/᩵֨֨;Ll/ۙ֨֨;Z)V
    .locals 1

    .line 1029
    invoke-virtual {p1}, Ll/֨֨֨;->ۤ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1030
    :cond_0
    iget-object v0, p1, Ll/֨֨֨;->ܰ:Ljava/util/ArrayDeque;

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۧۛ֨;->ۧ(Ll/֨֨֨;Ll/᩵֨֨;Ll/ۙ֨֨;Z)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public abstract ۧ(Ll/֨֨֨;Ll/᩵֨֨;Ll/ۙ֨֨;Z)Ll/ۖܶ۠;
.end method
