.class public final Ll/᩸֫ᩳ;
.super Ljava/lang/Object;
.source "S7JE"

# interfaces
.implements Ll/ܰܿܽ;


# instance fields
.field public final synthetic ֫:Ll/ۧۘܽ;


# direct methods
.method public constructor <init>(Ll/ۧۘܽ;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸֫ᩳ;->֫:Ll/ۧۘܽ;

    return-void
.end method


# virtual methods
.method public final text(Ljava/lang/String;)V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/᩸֫ᩳ;->֫:Ll/ۧۘܽ;

    invoke-virtual {v0, p1}, Ll/ۧۘܽ;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 61
    iget-object v0, p0, Ll/᩸֫ᩳ;->֫:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ۧۘܽ;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 66
    iget-object v0, p0, Ll/᩸֫ᩳ;->֫:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Ll/ۧۘܽ;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 56
    iget-object v0, p0, Ll/᩸֫ᩳ;->֫:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ۧۘܽ;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method
