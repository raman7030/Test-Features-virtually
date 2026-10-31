.class public final Ll/ۡܽۖ;
.super Ljava/lang/Object;
.source "U4HR"


# instance fields
.field public final ֫:Ll/ۢܽۖ;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۢܽۖ;Ljava/lang/String;)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Ll/ۡܽۖ;->֫:Ll/ۢܽۖ;

    .line 130
    iput-object p2, p0, Ll/ۡܽۖ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    iget-object v1, p0, Ll/ۡܽۖ;->֫:Ll/ۢܽۖ;

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    iget-object v1, p0, Ll/ۡܽۖ;->ۧ:Ljava/lang/String;

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۢܽۖ;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ۡܽۖ;->֫:Ll/ۢܽۖ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۡܽۖ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۡܽۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method
