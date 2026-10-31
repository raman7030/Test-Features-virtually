.class public final Ll/ۚ᩺᩷;
.super Ljava/lang/Exception;
.source "U1FZ"


# instance fields
.field public ᩶:Ljava/lang/String;

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/֫ۘܽ;)V
    .locals 2

    const-string v0, ": "

    .line 0
    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 11
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    iput-object p1, p0, Ll/ۚ᩺᩷;->᩶:Ljava/lang/String;

    .line 13
    invoke-virtual {p2}, Ll/֫ۘܽ;->֫()Ll/ܽۘܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܽ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/ۚ᩺᩷;->᩹:I

    .line 14
    invoke-virtual {p2}, Ll/֫ۘܽ;->֫()Ll/ܽۘܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܽ;->֫()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۚ᩺᩷;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۚ᩺᩷;->᩶:Ljava/lang/String;

    return-object v0
.end method
