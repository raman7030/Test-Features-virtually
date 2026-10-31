.class public final synthetic Ll/ۖۤۡ;
.super Ljava/lang/Object;
.source "T2R9"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:[B

.field public final synthetic ۧ:I

.field public final synthetic ܽ:I


# direct methods
.method public synthetic constructor <init>([BII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۤۡ;->֫:[B

    iput p2, p0, Ll/ۖۤۡ;->ۧ:I

    iput p3, p0, Ll/ۖۤۡ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 2
    iget v0, p0, Ll/ۖۤۡ;->ۧ:I

    .line 4
    iget v1, p0, Ll/ۖۤۡ;->ܽ:I

    .line 43
    iget-object v2, p0, Ll/ۖۤۡ;->֫:[B

    invoke-static {v0, v1, v2}, Ll/ۘۤۡ;->֫(II[B)[B

    move-result-object v0

    return-object v0
.end method
