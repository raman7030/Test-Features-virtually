.class public final Ll/֫ۧۢ;
.super Ljava/lang/Exception;
.source "41IC"


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܳܿ֡;)V
    .locals 1

    .line 11
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    iput-object p1, p0, Ll/֫ۧۢ;->᩹:Ljava/lang/String;

    .line 13
    iget p1, p2, Ll/ܳܿ֡;->ۙ:I

    iput p1, p0, Ll/֫ۧۢ;->᩶:I

    .line 14
    iget p1, p2, Ll/ܳܿ֡;->᩹:I

    iput p1, p0, Ll/֫ۧۢ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/֫ۧۢ;->᩹:Ljava/lang/String;

    return-object v0
.end method
