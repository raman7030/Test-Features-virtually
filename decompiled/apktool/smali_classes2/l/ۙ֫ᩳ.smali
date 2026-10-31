.class public final Ll/ۙ֫ᩳ;
.super Ljava/lang/Exception;
.source "U56S"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 3

    .line 10
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    const p1, 0x7f1202a5

    .line 9
    invoke-static {p1, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 11
    iput p2, p0, Ll/ۙ֫ᩳ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 15
    iget v0, p0, Ll/ۙ֫ᩳ;->᩸:I

    return v0
.end method
