.class public final Ll/ۜ֡ᩳ;
.super Ljava/lang/Object;
.source "P6RO"


# instance fields
.field public final ֫:Ll/֨۬ᩳ;

.field public final ۧ:Ljava/util/concurrent/Executor;

.field public final ܽ:Ll/ۙ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    .line 25
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    .line 26
    invoke-static {p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, Ljava/util/concurrent/Executor;

    iput-object p3, p0, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static ֫()Ll/֨۬ᩳ;
    .locals 1

    .line 29
    sget-object v0, Ll/᩻֡ᩳ;->֫:Ll/ۜ֡ᩳ;

    .line 32
    iget-object v0, v0, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    return-object v0
.end method

.method public static ۧ()Ljava/util/concurrent/Executor;
    .locals 1

    .line 29
    sget-object v0, Ll/᩻֡ᩳ;->֫:Ll/ۜ֡ᩳ;

    .line 36
    iget-object v0, v0, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static ܽ()Ll/ۙ۬ᩳ;
    .locals 1

    .line 29
    sget-object v0, Ll/᩻֡ᩳ;->֫:Ll/ۜ֡ᩳ;

    .line 33
    iget-object v0, v0, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    return-object v0
.end method
