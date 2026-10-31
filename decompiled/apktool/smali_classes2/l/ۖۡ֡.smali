.class public final Ll/ۖۡ֡;
.super Ljava/lang/Object;
.source "O2J5"

# interfaces
.implements Ljava/io/FileFilter;
.implements Ljava/io/FilenameFilter;
.implements Ll/ۢ۠ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x79e1c04752927a87L

.field public static final ᩸:Ll/ۖۡ֡;

.field public static final ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۖۡ֡;->᩹:Ljava/lang/String;

    .line 46
    new-instance v0, Ll/ۖۡ֡;

    .line 57
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    sput-object v0, Ll/ۖۡ֡;->᩸:Ll/ۖۡ֡;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final matches(Ll/᩷۠ᩴ;)Z
    .locals 0

    .line 93
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    .line 99
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    sget-object p1, Ll/ܽ۠ᩴ;->TERMINATE:Ll/ܽ۠ᩴ;

    const/4 p1, 0x1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 115
    sget-object v0, Ll/ۖۡ֡;->᩹:Ljava/lang/String;

    return-object v0
.end method
