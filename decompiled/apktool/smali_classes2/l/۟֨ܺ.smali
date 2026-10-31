.class public final Ll/۟֨ܺ;
.super Ljava/lang/Object;
.source "0BK7"


# instance fields
.field public final ֫:Ll/ۤ֨ܺ;

.field public final ۧ:Ll/ۨ֨ܺ;

.field public final ܽ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 43
    new-instance v0, Ll/֫۠ܺ;

    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v1, Ll/ۤ֨ܺ;

    .line 38
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Ll/۟֨ܺ;->ܽ:Ljava/util/HashSet;

    .line 56
    iput-object v0, p0, Ll/۟֨ܺ;->ۧ:Ll/ۨ֨ܺ;

    .line 57
    iput-object v1, p0, Ll/۟֨ܺ;->֫:Ll/ۤ֨ܺ;

    return-void
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 270
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Ljava/io/File;
    .locals 4

    .line 229
    iget-object v0, p0, Ll/۟֨ܺ;->ۧ:Ll/ۨ֨ܺ;

    check-cast v0, Ll/֫۠ܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "pl_droidsonroids_gif"

    .line 41
    invoke-static {v0}, Ljava/lang/System;->mapLibraryName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 232
    new-instance v1, Ljava/io/File;

    const-string v2, "lib"

    const/4 v3, 0x0

    .line 217
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object p1

    .line 232
    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method
