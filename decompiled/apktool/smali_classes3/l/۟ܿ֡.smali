.class public final Ll/۟ܿ֡;
.super Ljava/lang/Object;
.source "0AS6"

# interfaces
.implements Ll/ۚܳ֡;


# static fields
.field public static final ֫:Ll/۟ܿ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ll/۟ܿ֡;

    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    sput-object v0, Ll/۟ܿ֡;->֫:Ll/۟ܿ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩷᩷֡;ILjava/lang/String;IIIII)Ll/֡ܳ֡;
    .locals 7

    .line 70
    new-instance v6, Ll/ܰܿ֡;

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Ll/ܰܿ֡;-><init>(Ll/᩷᩷֡;IIII)V

    .line 157
    iput p7, v6, Ll/ܰܿ֡;->ۙ:I

    .line 203
    iput p8, v6, Ll/ܰܿ֡;->᩹:I

    if-eqz p3, :cond_0

    .line 188
    iput-object p3, v6, Ll/ܰܿ֡;->ۤ:Ljava/lang/String;

    :cond_0
    return-object v6
.end method
