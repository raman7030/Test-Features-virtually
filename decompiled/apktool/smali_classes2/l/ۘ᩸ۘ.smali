.class public final Ll/ۘ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "yy.MM.dd.HH"

    .line 92
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    iput p1, p0, Ll/ۘ᩸ۘ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 296
    iget v0, p0, Ll/ۘ᩸ۘ;->֫:I

    return v0
.end method
