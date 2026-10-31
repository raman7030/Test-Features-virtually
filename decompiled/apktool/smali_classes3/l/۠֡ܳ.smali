.class public final Ll/۠֡ܳ;
.super Ll/֡۬ܿ;
.source "XAJ9"


# instance fields
.field public final ۬:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;)V
    .locals 3

    .line 583
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x0

    invoke-direct {p0, p1, v1, v2, v0}, Ll/֡۬ܿ;-><init>(Ljava/lang/String;JLjava/lang/Object;)V

    .line 584
    iput-object p2, p0, Ll/۠֡ܳ;->۬:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 1

    .line 589
    iget-object v0, p0, Ll/۠֡ܳ;->۬:Ljava/io/IOException;

    throw v0
.end method
