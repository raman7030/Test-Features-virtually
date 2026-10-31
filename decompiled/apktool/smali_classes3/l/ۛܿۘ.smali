.class public abstract Ll/ۛܿۘ;
.super Ljava/lang/Object;
.source "K1MJ"

# interfaces
.implements Ll/֫ܳۘ;


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Ll/ۛܿۘ;->֫:I

    .line 30
    iput p2, p0, Ll/ۛܿۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܰܿۘ;
    .locals 1

    .line 41
    new-instance v0, Ll/ܰܿۘ;

    invoke-direct {v0, p0}, Ll/ܰܿۘ;-><init>(Ll/֫ܳۘ;)V

    return-object v0
.end method

.method public final ܳ()Ljava/util/Iterator;
    .locals 2

    .line 46
    new-instance v0, Ll/۫ܿۘ;

    invoke-virtual {p0}, Ll/ۛܿۘ;->᩻()Ll/۬ܿۘ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۫ܿۘ;-><init>(Ll/۬ܿۘ;)V

    return-object v0
.end method

.method public final ܽ()Ljava/util/Iterator;
    .locals 4

    .line 52
    new-instance v0, Ll/ۤܿۘ;

    invoke-virtual {p0}, Ll/ۛܿۘ;->᩻()Ll/۬ܿۘ;

    move-result-object v1

    iget v2, p0, Ll/ۛܿۘ;->֫:I

    iget v3, p0, Ll/ۛܿۘ;->ۧ:I

    invoke-direct {v0, v1, v2, v3}, Ll/ۤܿۘ;-><init>(Ll/۬ܿۘ;II)V

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 35
    iget v0, p0, Ll/ۛܿۘ;->֫:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 40
    iget v0, p0, Ll/ۛܿۘ;->ۧ:I

    return v0
.end method

.method public abstract ᩻()Ll/۬ܿۘ;
.end method
