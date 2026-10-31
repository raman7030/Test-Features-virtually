.class public abstract Ll/ۖۧۢ;
.super Ljava/lang/Object;
.source "0BM3"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ᩹:Ll/ۨۘܽ;


# instance fields
.field public ᩸:Ll/ۜۧۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "^\\s*\\.class\\s+([a-z]+\\s+)*(L.+?;)"

    const/16 v1, 0x8

    .line 18
    invoke-static {v1, v0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۖۧۢ;->᩹:Ll/ۨۘܽ;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .line 22
    sget-object v0, Ll/ۖۧۢ;->᩹:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ll/۫ۘܽ;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 24
    invoke-virtual {p0, v0}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/Object;
.end method

.method public abstract ֫(IILl/᩷ۧۢ;)V
.end method

.method public ֫(Ll/ۜۧۢ;)V
    .locals 0

    .line 31
    iput-object p1, p0, Ll/ۖۧۢ;->᩸:Ll/ۜۧۢ;

    return-void
.end method

.method public abstract ֫(Ll/ۡ᩹ۡ;)V
.end method

.method public abstract ֫(Ll/۫ۧۢ;Ljava/lang/CharSequence;)V
.end method
