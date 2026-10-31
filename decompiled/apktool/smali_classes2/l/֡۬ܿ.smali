.class public abstract Ll/֡۬ܿ;
.super Ljava/lang/Object;
.source "6AK0"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:J

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/Object;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/Object;)V
    .locals 0

    .line 353
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 354
    iput-object p1, p0, Ll/֡۬ܿ;->ۙ:Ljava/lang/String;

    .line 355
    iput-wide p2, p0, Ll/֡۬ܿ;->ۗ:J

    .line 356
    iput-object p4, p0, Ll/֡۬ܿ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 346
    check-cast p1, Ll/֡۬ܿ;

    .line 367
    iget-object v0, p0, Ll/֡۬ܿ;->ۙ:Ljava/lang/String;

    iget-object p1, p1, Ll/֡۬ܿ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public abstract ֫()Ljava/io/InputStream;
.end method
