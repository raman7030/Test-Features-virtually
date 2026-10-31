.class public final Ll/ۡۤ֡;
.super Ll/֫۫֡;
.source "N539"

# interfaces
.implements Ll/۫ۧۚ;


# static fields
.field public static final ۬:Ll/ۘۗ֡;


# instance fields
.field public final ۗ:I

.field public final ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    sget-object v0, Ll/ۘۗ֡;->ۜ֫:Ll/ۘۗ֡;

    sput-object v0, Ll/ۡۤ֡;->۬:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;IILl/ܿ۫֡;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1, p4}, Ll/֫۫֡;-><init>(Ll/֨ۗ֡;Ll/ܿ۫֡;)V

    .line 54
    invoke-static {p2}, Ll/ۧᩳܽ;->ܽ(I)V

    iput p2, p0, Ll/ۡۤ֡;->ۙ:I

    .line 55
    invoke-static {p3}, Ll/ۧᩳܽ;->ܽ(I)V

    iput p3, p0, Ll/ۡۤ֡;->ۗ:I

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۡۤ֡;->֫()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", v"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۡۤ֡;->ܶ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/֫۫֡;->ۖ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ۡۤ֡;->ۙ:I

    return v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 70
    sget-object v0, Ll/ۡۤ֡;->۬:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ܶ()I
    .locals 1

    .line 65
    iget v0, p0, Ll/ۡۤ֡;->ۗ:I

    return v0
.end method
