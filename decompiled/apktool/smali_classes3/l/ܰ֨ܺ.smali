.class public final Ll/ܰ֨ܺ;
.super Ljava/lang/Object;
.source "0BK7"

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 253
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ֨ܺ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    .line 256
    iget-object p1, p0, Ll/ܰ֨ܺ;->᩸:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
