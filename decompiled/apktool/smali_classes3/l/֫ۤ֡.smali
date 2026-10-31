.class public final Ll/֫ۤ֡;
.super Ll/֫۫֡;
.source "R4Q6"

# interfaces
.implements Ll/ۚۧۚ;


# static fields
.field public static final ۙ:Ll/ۘۗ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    sget-object v0, Ll/ۘۗ֡;->᩺:Ll/ۘۗ֡;

    sput-object v0, Ll/֫ۤ֡;->ۙ:Ll/ۘۗ֡;

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/֫۫֡;->ۖ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 52
    sget-object v0, Ll/֫ۤ֡;->ۙ:Ll/ۘۗ֡;

    return-object v0
.end method
