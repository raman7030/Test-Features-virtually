.class public final Ll/᩹ۢ֨;
.super Ll/ۙۢ֨;
.source "I51P"


# instance fields
.field public final ֫:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 197
    iput-object p1, p0, Ll/᩹ۢ֨;->֫:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final ֫()Lpl/droidsonroids/gif/GifInfoHandle;
    .locals 2

    .line 202
    new-instance v0, Lpl/droidsonroids/gif/GifInfoHandle;

    iget-object v1, p0, Ll/᩹ۢ֨;->֫:Ljava/io/InputStream;

    invoke-direct {v0, v1}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method
