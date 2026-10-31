.class public abstract Ll/ۡۘܽ;
.super Ljava/lang/Object;
.source "91EO"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۤۜܽ;Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 1

    .line 61
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 64
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 65
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->ᩳ(I)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩵ۘܽ;
    .locals 1

    .line 23
    invoke-virtual {p0}, Ll/ۡۘܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    move-object v0, p0

    check-cast v0, Ll/᩵ۘܽ;

    return-object v0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract ֫(Ll/ۤۜܽ;Ljava/util/HashMap;)V
.end method

.method public abstract ֫(Ll/۬ۜܽ;Landroid/util/SparseArray;)V
.end method

.method public final ۧ()I
    .locals 1

    .line 43
    iget v0, p0, Ll/ۡۘܽ;->֫:I

    return v0
.end method

.method public abstract ܳ()Z
.end method

.method public final ܽ()I
    .locals 1

    .line 51
    iget v0, p0, Ll/ۡۘܽ;->ۧ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 47
    iget v0, p0, Ll/ۡۘܽ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 39
    iget v0, p0, Ll/ۡۘܽ;->ܽ:I

    return v0
.end method
