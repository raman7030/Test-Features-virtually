.class public abstract Ll/ܺ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ᩶:Ll/ۚ᩸ۘ;

.field public volatile ᩸:I

.field public volatile ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    sget-object v0, Ll/ۚ᩸ۘ;->֫:Ll/ۚ᩸ۘ;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    sget-object v1, Ll/ᩴ᩸ۘ;->֫:Ljava/lang/String;

    const/16 v1, 0x3c

    iput v1, p0, Ll/ܺ᩸ۘ;->᩸:I

    const/4 v2, 0x1

    .line 18
    iput-boolean v2, p0, Ll/ܺ᩸ۘ;->᩹:Z

    .line 20
    iput-object v0, p0, Ll/ܺ᩸ۘ;->᩶:Ll/ۚ᩸ۘ;

    .line 125
    iput v1, p0, Ll/ܺ᩸ۘ;->᩸:I

    .line 148
    iput-boolean v2, p0, Ll/ܺ᩸ۘ;->᩹:Z

    .line 171
    iput-object v0, p0, Ll/ܺ᩸ۘ;->᩶:Ll/ۚ᩸ۘ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۚ᩸ۘ;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ܺ᩸ۘ;->᩶:Ll/ۚ᩸ۘ;

    return-object v0
.end method

.method public final ֫(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 136
    iget-boolean v0, p0, Ll/ܺ᩸ۘ;->᩹:Z

    if-eqz v0, :cond_0

    .line 75
    iget v0, p0, Ll/ܺ᩸ۘ;->᩸:I

    and-int/2addr v0, p1

    if-ne p1, v0, :cond_0

    .line 78
    invoke-virtual/range {p0 .. p7}, Ll/ܺ᩸ۘ;->ۧ(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public abstract ۧ(ILjava/lang/Thread;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method
