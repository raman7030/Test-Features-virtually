.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;
.super Ljava/lang/Object;
.source "S3ClientReference.java"


# static fields
.field public static ֫:Ll/ۧۤᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;->֫:Ll/ۧۤᩴ;

    return-void
.end method

.method public static ֫(Ljava/lang/Integer;)Lcom/amazonaws/services/s3/AmazonS3;
    .locals 1

    .line 52
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/amazonaws/services/s3/AmazonS3;

    return-object p0
.end method

.method public static ۧ(Ljava/lang/Integer;)V
    .locals 1

    .line 61
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/S3ClientReference;->֫:Ll/ۧۤᩴ;

    invoke-virtual {v0, p0}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
