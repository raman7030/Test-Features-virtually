.class public final enum Lcom/amazonaws/services/s3/model/GroupGrantee;
.super Ljava/lang/Enum;
.source "GroupGrantee.java"

# interfaces
.implements Lcom/amazonaws/services/s3/model/Grantee;


# static fields
.field public static final enum ۗ:Lcom/amazonaws/services/s3/model/GroupGrantee;

.field public static final enum ۙ:Lcom/amazonaws/services/s3/model/GroupGrantee;

.field public static final enum ᩶:Lcom/amazonaws/services/s3/model/GroupGrantee;

.field public static final synthetic ᩹:[Lcom/amazonaws/services/s3/model/GroupGrantee;


# instance fields
.field public ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 36
    new-instance v0, Lcom/amazonaws/services/s3/model/GroupGrantee;

    const-string v1, "http://acs.amazonaws.com/groups/global/AllUsers"

    const-string v2, "AllUsers"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/amazonaws/services/s3/model/GroupGrantee;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩶:Lcom/amazonaws/services/s3/model/GroupGrantee;

    .line 44
    new-instance v1, Lcom/amazonaws/services/s3/model/GroupGrantee;

    const-string v2, "http://acs.amazonaws.com/groups/global/AuthenticatedUsers"

    const-string v4, "AuthenticatedUsers"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lcom/amazonaws/services/s3/model/GroupGrantee;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/amazonaws/services/s3/model/GroupGrantee;->ۙ:Lcom/amazonaws/services/s3/model/GroupGrantee;

    .line 52
    new-instance v2, Lcom/amazonaws/services/s3/model/GroupGrantee;

    const-string v4, "http://acs.amazonaws.com/groups/s3/LogDelivery"

    const-string v6, "LogDelivery"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lcom/amazonaws/services/s3/model/GroupGrantee;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/amazonaws/services/s3/model/GroupGrantee;->ۗ:Lcom/amazonaws/services/s3/model/GroupGrantee;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/amazonaws/services/s3/model/GroupGrantee;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    .line 23
    sput-object v4, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩹:[Lcom/amazonaws/services/s3/model/GroupGrantee;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 66
    iput-object p3, p0, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/GroupGrantee;
    .locals 1

    .line 23
    const-class v0, Lcom/amazonaws/services/s3/model/GroupGrantee;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/services/s3/model/GroupGrantee;

    return-object p0
.end method

.method public static values()[Lcom/amazonaws/services/s3/model/GroupGrantee;
    .locals 1

    .line 23
    sget-object v0, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩹:[Lcom/amazonaws/services/s3/model/GroupGrantee;

    invoke-virtual {v0}, [Lcom/amazonaws/services/s3/model/GroupGrantee;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/amazonaws/services/s3/model/GroupGrantee;

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/GroupGrantee;
    .locals 5

    .line 109
    invoke-static {}, Lcom/amazonaws/services/s3/model/GroupGrantee;->values()[Lcom/amazonaws/services/s3/model/GroupGrantee;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 110
    iget-object v4, v3, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩸:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GroupGrantee ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩸:Ljava/lang/String;

    const-string v2, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/GroupGrantee;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 1

    .line 85
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Group grantees have preset identifiers that cannot be modified."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "uri"

    return-object v0
.end method
