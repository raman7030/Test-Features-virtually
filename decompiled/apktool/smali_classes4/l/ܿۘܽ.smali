.class public final Ll/ܿۘܽ;
.super Ljava/lang/Object;
.source "M1FH"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ܽۘܽ;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/Object;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:Ll/ܽۘܽ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ܽۘܽ;Ll/ܽۘܽ;)V
    .locals 0

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    iput-object p1, p0, Ll/ܿۘܽ;->ܽ:Ljava/lang/String;

    .line 214
    iput-object p2, p0, Ll/ܿۘܽ;->ᩳ:Ljava/lang/String;

    .line 215
    iput-object p3, p0, Ll/ܿۘܽ;->֫:Ljava/lang/String;

    .line 216
    iput-object p4, p0, Ll/ܿۘܽ;->ܳ:Ljava/lang/String;

    .line 217
    iput-object p5, p0, Ll/ܿۘܽ;->ۧ:Ll/ܽۘܽ;

    .line 218
    iput-object p6, p0, Ll/ܿۘܽ;->᩻:Ll/ܽۘܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ܿۘܽ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 255
    iput-object p1, p0, Ll/ܿۘܽ;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public final ۧ()Ll/ܽۘܽ;
    .locals 1

    .line 242
    iget-object v0, p0, Ll/ܿۘܽ;->ۧ:Ll/ܽۘܽ;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ܿۘܽ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ܿۘܽ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/Object;
    .locals 1

    .line 251
    iget-object v0, p0, Ll/ܿۘܽ;->ܿ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 3

    .line 234
    iget-object v0, p0, Ll/ܿۘܽ;->֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ܿۘܽ;->ᩳ:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final ᩻()Ll/ܽۘܽ;
    .locals 1

    .line 246
    iget-object v0, p0, Ll/ܿۘܽ;->᩻:Ll/ܽۘܽ;

    return-object v0
.end method
