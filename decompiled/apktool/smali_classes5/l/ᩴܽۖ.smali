.class public final enum Ll/ᩴܽۖ;
.super Ll/۠ܽۖ;
.source "Q87L"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, p1, p2, v0}, Ll/۠ܽۖ;-><init>(Ljava/lang/String;ILl/ۖܽۖ;)V

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/reflect/Field;)Ljava/util/List;
    .locals 0

    .line 53
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public ۧ(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 1

    .line 75
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {p1, v0}, Ll/۠ܽۖ;->֫(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۠ܽۖ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
