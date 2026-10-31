.class public final Ll/۫۠ۖ;
.super Ljava/lang/Object;
.source "X23D"


# instance fields
.field public ֫:Ll/֡۠ۖ;

.field public ۧ:I

.field public ܽ:Ll/᩹۠ۖ;

.field public ܿ:Ll/ܶ۠ۖ;

.field public ᩳ:Ll/ۚ۠ۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 38
    iput v0, p0, Ll/۫۠ۖ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc8

    const-string v1, "<<\n mode: "

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 69
    iget-object v1, p0, Ll/۫۠ۖ;->ᩳ:Ll/ۚ۠ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n ecLevel: "

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    iget-object v1, p0, Ll/۫۠ۖ;->֫:Ll/֡۠ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n version: "

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    iget-object v1, p0, Ll/۫۠ۖ;->ܿ:Ll/ܶ۠ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n maskPattern: "

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    iget v1, p0, Ll/۫۠ۖ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    iget-object v1, p0, Ll/۫۠ۖ;->ܽ:Ll/᩹۠ۖ;

    if-nez v1, :cond_0

    const-string v1, "\n matrix: null\n"

    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "\n matrix:\n"

    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    iget-object v1, p0, Ll/۫۠ۖ;->ܽ:Ll/᩹۠ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, ">>\n"

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/᩹۠ۖ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/۫۠ۖ;->ܽ:Ll/᩹۠ۖ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 99
    iput p1, p0, Ll/۫۠ۖ;->ۧ:I

    return-void
.end method

.method public final ֫(Ll/֡۠ۖ;)V
    .locals 0

    .line 91
    iput-object p1, p0, Ll/۫۠ۖ;->֫:Ll/֡۠ۖ;

    return-void
.end method

.method public final ֫(Ll/ۚ۠ۖ;)V
    .locals 0

    .line 87
    iput-object p1, p0, Ll/۫۠ۖ;->ᩳ:Ll/ۚ۠ۖ;

    return-void
.end method

.method public final ֫(Ll/ܶ۠ۖ;)V
    .locals 0

    .line 95
    iput-object p1, p0, Ll/۫۠ۖ;->ܿ:Ll/ܶ۠ۖ;

    return-void
.end method

.method public final ֫(Ll/᩹۠ۖ;)V
    .locals 0

    .line 103
    iput-object p1, p0, Ll/۫۠ۖ;->ܽ:Ll/᩹۠ۖ;

    return-void
.end method
