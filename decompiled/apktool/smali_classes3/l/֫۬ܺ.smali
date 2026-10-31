.class public final Ll/֫۬ܺ;
.super Ll/ۛۗܺ;
.source "Y4VB"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    .line 776
    invoke-direct {p0, v0}, Ll/ۛۗܺ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ll/ۨۗܺ;
    .locals 0

    .line 789
    invoke-virtual {p0, p1}, Ll/ۛۗܺ;->֫(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final ֫()Ll/ܳ۬ܺ;
    .locals 2

    const/4 v0, 0x1

    .line 846
    iput-boolean v0, p0, Ll/ۛۗܺ;->ۧ:Z

    .line 847
    iget-object v0, p0, Ll/ۛۗܺ;->֫:[Ljava/lang/Object;

    iget v1, p0, Ll/ۛۗܺ;->ܽ:I

    invoke-static {v1, v0}, Ll/ܳ۬ܺ;->ۧ(I[Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final varargs ֫([Ljava/lang/Object;)V
    .locals 1

    .line 534
    array-length v0, p1

    invoke-virtual {p0, v0, p1}, Ll/ۛۗܺ;->֫(I[Ljava/lang/Object;)V

    return-void
.end method
