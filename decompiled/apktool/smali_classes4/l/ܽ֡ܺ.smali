.class public final Ll/ܽ֡ܺ;
.super Ljava/lang/Object;
.source "OB7X"


# static fields
.field public static final ܽ:Ll/ܽ֡ܺ;

.field public static final ᩳ:Ll/ܽ֡ܺ;


# instance fields
.field public ֫:Ll/֫֡ܺ;

.field public ۧ:Ll/ۧ֡ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 53
    new-instance v0, Ll/ܽ֡ܺ;

    sget-object v1, Ll/֫֡ܺ;->᩹:Ll/֫֡ܺ;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ܽ֡ܺ;-><init>(Ll/֫֡ܺ;Ll/ۧ֡ܺ;)V

    sput-object v0, Ll/ܽ֡ܺ;->ᩳ:Ll/ܽ֡ܺ;

    .line 64
    new-instance v0, Ll/ܽ֡ܺ;

    sget-object v1, Ll/֫֡ܺ;->۫:Ll/֫֡ܺ;

    sget-object v2, Ll/ۧ֡ܺ;->᩹:Ll/ۧ֡ܺ;

    invoke-direct {v0, v1, v2}, Ll/ܽ֡ܺ;-><init>(Ll/֫֡ܺ;Ll/ۧ֡ܺ;)V

    sput-object v0, Ll/ܽ֡ܺ;->ܽ:Ll/ܽ֡ܺ;

    .line 75
    sget-object v0, Ll/֫֡ܺ;->᩹:Ll/֫֡ܺ;

    .line 86
    sget-object v0, Ll/֫֡ܺ;->᩹:Ll/֫֡ܺ;

    .line 97
    sget-object v0, Ll/֫֡ܺ;->᩹:Ll/֫֡ܺ;

    .line 108
    sget-object v0, Ll/֫֡ܺ;->᩹:Ll/֫֡ܺ;

    .line 120
    sget-object v0, Ll/ۧ֡ܺ;->᩹:Ll/ۧ֡ܺ;

    return-void
.end method

.method public constructor <init>(Ll/֫֡ܺ;Ll/ۧ֡ܺ;)V
    .locals 0

    .line 193
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    iput-object p1, p0, Ll/ܽ֡ܺ;->֫:Ll/֫֡ܺ;

    .line 195
    iput-object p2, p0, Ll/ܽ֡ܺ;->ۧ:Ll/ۧ֡ܺ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 244
    :cond_1
    const-class v2, Ll/ܽ֡ܺ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 246
    :cond_2
    check-cast p1, Ll/ܽ֡ܺ;

    .line 247
    iget-object v2, p0, Ll/ܽ֡ܺ;->֫:Ll/֫֡ܺ;

    iget-object v3, p1, Ll/ܽ֡ܺ;->֫:Ll/֫֡ܺ;

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Ll/ܽ֡ܺ;->ۧ:Ll/ۧ֡ܺ;

    iget-object p1, p1, Ll/ܽ֡ܺ;->ۧ:Ll/ۧ֡ܺ;

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܽ֡ܺ;->֫:Ll/֫֡ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽ֡ܺ;->ۧ:Ll/ۧ֡ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫֡ܺ;
    .locals 1

    .line 222
    iget-object v0, p0, Ll/ܽ֡ܺ;->֫:Ll/֫֡ܺ;

    return-object v0
.end method

.method public final ۧ()Ll/ۧ֡ܺ;
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ܽ֡ܺ;->ۧ:Ll/ۧ֡ܺ;

    return-object v0
.end method
