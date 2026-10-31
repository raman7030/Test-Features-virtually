.class public final Ll/۟۟᩻;
.super Ljava/lang/Object;
.source "N75S"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Z

.field public final ۙ:Ljava/lang/String;

.field public final ۬:Z

.field public final ᩶:Ll/ܶ᩵ܿ;

.field public final ᩸:J

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;JJZZ)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/۟۟᩻;->᩶:Ll/ܶ᩵ܿ;

    .line 23
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    .line 24
    iput-wide p2, p0, Ll/۟۟᩻;->᩹:J

    .line 25
    iput-wide p4, p0, Ll/۟۟᩻;->᩸:J

    .line 26
    iput-boolean p6, p0, Ll/۟۟᩻;->۬:Z

    .line 27
    iput-boolean p7, p0, Ll/۟۟᩻;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 35
    iget-boolean v0, p0, Ll/۟۟᩻;->۬:Z

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Ll/۟۟᩻;->᩶:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void
.end method
