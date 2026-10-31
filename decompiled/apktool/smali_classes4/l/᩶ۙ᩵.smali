.class public final Ll/᩶ۙ᩵;
.super Ljava/lang/Object;
.source "DBEE"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:I

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 331
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۙ᩵;->᩹:Ljava/lang/String;

    iput p2, p0, Ll/᩶ۙ᩵;->᩸:I

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 3

    .line 336
    new-instance v0, Ll/ۙۙ᩵;

    iget-object v1, p0, Ll/᩶ۙ᩵;->᩹:Ljava/lang/String;

    iget v2, p0, Ll/᩶ۙ᩵;->᩸:I

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ll/ۙۙ᩵;-><init>(Ljava/util/regex/Pattern;)V

    return-object v0
.end method
