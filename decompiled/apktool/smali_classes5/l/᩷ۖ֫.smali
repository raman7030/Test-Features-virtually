.class public final Ll/᩷ۖ֫;
.super Ll/ܿۖ֫;
.source "K5GD"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public final ۧ:Ll/ۜۖ֫;


# direct methods
.method public constructor <init>(Ll/᩻ۡ֫;Ll/ۗܺ֫;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 372
    iput-object p1, p0, Ll/᩷ۖ֫;->֫:Ljava/lang/Object;

    .line 373
    invoke-static {p2}, Ll/ۜۖ֫;->֫(Ll/ۗܺ֫;)Ll/ۜۖ֫;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۖ֫;->ۧ:Ll/ۜۖ֫;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const/16 v0, 0x80

    const-string v1, "LoaderManager{"

    .line 0
    invoke-static {v0, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 488
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    .line 489
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    iget-object v1, p0, Ll/᩷ۖ֫;->֫:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-gtz v3, :cond_0

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x2e

    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-lez v3, :cond_0

    add-int/lit8 v3, v3, 0x1

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 42
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}}"

    .line 491
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 481
    iget-object v0, p0, Ll/᩷ۖ֫;->ۧ:Ll/ۜۖ֫;

    invoke-virtual {v0}, Ll/ۜۖ֫;->ᩳ()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 498
    iget-object v0, p0, Ll/᩷ۖ֫;->ۧ:Ll/ۜۖ֫;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۜۖ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method
