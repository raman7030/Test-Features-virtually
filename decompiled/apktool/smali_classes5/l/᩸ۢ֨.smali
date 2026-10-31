.class public final Ll/᩸ۢ֨;
.super Ll/ۙۢ֨;
.source "I51P"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۢ֨;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Lpl/droidsonroids/gif/GifInfoHandle;
    .locals 2

    .line 112
    new-instance v0, Lpl/droidsonroids/gif/GifInfoHandle;

    iget-object v1, p0, Ll/᩸ۢ֨;->֫:Ljava/lang/String;

    invoke-direct {v0, v1}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
