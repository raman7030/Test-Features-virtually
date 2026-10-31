.class public Lcom/amazonaws/regions/RegionDefaults;
.super Ljava/lang/Object;
.source "RegionDefaults.java"


# direct methods
.method public static ֫()Ljava/util/ArrayList;
    .locals 27

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "af-south-1"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.af-south-1.amazonaws.com"

    const-string v3, "autoscaling"

    .line 30
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "dynamodb.af-south-1.amazonaws.com"

    const-string v4, "dynamodb"

    .line 31
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ec2.af-south-1.amazonaws.com"

    const-string v5, "ec2"

    .line 32
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "elasticloadbalancing.af-south-1.amazonaws.com"

    const-string v6, "elasticloadbalancing"

    .line 33
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kms.af-south-1.amazonaws.com"

    const-string v7, "kms"

    .line 35
    invoke-static {v1, v7, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "lambda.af-south-1.amazonaws.com"

    const-string v8, "lambda"

    .line 36
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "logs.af-south-1.amazonaws.com"

    const-string v9, "logs"

    .line 37
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "s3.af-south-1.amazonaws.com"

    const-string v10, "s3"

    .line 38
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sns.af-south-1.amazonaws.com"

    const-string v11, "sns"

    .line 39
    invoke-static {v1, v11, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sqs.af-south-1.amazonaws.com"

    const-string v12, "sqs"

    .line 40
    invoke-static {v1, v12, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sts.af-south-1.amazonaws.com"

    const-string v13, "sts"

    .line 41
    invoke-static {v1, v13, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ap-northeast-1"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.ap-northeast-1.amazonaws.com"

    .line 45
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-identity.ap-northeast-1.amazonaws.com"

    const-string v14, "cognito-identity"

    .line 46
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-idp.ap-northeast-1.amazonaws.com"

    const-string v15, "cognito-idp"

    .line 48
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-sync.ap-northeast-1.amazonaws.com"

    move-object/from16 v16, v15

    const-string v15, "cognito-sync"

    .line 49
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "data.iot.ap-northeast-1.amazonaws.com"

    move-object/from16 v17, v15

    const-string v15, "data.iot"

    .line 51
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "dynamodb.ap-northeast-1.amazonaws.com"

    .line 52
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ec2.ap-northeast-1.amazonaws.com"

    .line 53
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "elasticloadbalancing.ap-northeast-1.amazonaws.com"

    .line 54
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "firehose.ap-northeast-1.amazonaws.com"

    move-object/from16 v18, v6

    const-string v6, "firehose"

    .line 56
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "iot.ap-northeast-1.amazonaws.com"

    move-object/from16 v19, v6

    const-string v6, "iot"

    .line 57
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kinesis.ap-northeast-1.amazonaws.com"

    move-object/from16 v20, v6

    const-string v6, "kinesis"

    .line 58
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kms.ap-northeast-1.amazonaws.com"

    .line 59
    invoke-static {v1, v7, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "lambda.ap-northeast-1.amazonaws.com"

    .line 60
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "logs.ap-northeast-1.amazonaws.com"

    .line 61
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "polly.ap-northeast-1.amazonaws.com"

    move-object/from16 v21, v9

    const-string v9, "polly"

    .line 62
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "s3.ap-northeast-1.amazonaws.com"

    .line 63
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sdb.ap-northeast-1.amazonaws.com"

    move-object/from16 v22, v10

    const-string v10, "sdb"

    .line 64
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sns.ap-northeast-1.amazonaws.com"

    .line 65
    invoke-static {v1, v11, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sqs.ap-northeast-1.amazonaws.com"

    .line 66
    invoke-static {v1, v12, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sts.ap-northeast-1.amazonaws.com"

    .line 67
    invoke-static {v1, v13, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ap-northeast-2"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.ap-northeast-2.amazonaws.com"

    .line 71
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-identity.ap-northeast-2.amazonaws.com"

    .line 72
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-idp.ap-northeast-2.amazonaws.com"

    move-object/from16 v23, v10

    move-object/from16 v10, v16

    .line 74
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-sync.ap-northeast-2.amazonaws.com"

    move-object/from16 v10, v17

    .line 75
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "data.iot.ap-northeast-2.amazonaws.com"

    .line 77
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "dynamodb.ap-northeast-2.amazonaws.com"

    .line 78
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ec2.ap-northeast-2.amazonaws.com"

    .line 79
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "elasticloadbalancing.ap-northeast-2.amazonaws.com"

    move-object/from16 v17, v15

    move-object/from16 v15, v18

    .line 80
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "iot.ap-northeast-2.amazonaws.com"

    move-object/from16 v15, v20

    .line 82
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kinesis.ap-northeast-2.amazonaws.com"

    .line 83
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kms.ap-northeast-2.amazonaws.com"

    .line 84
    invoke-static {v1, v7, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "lambda.ap-northeast-2.amazonaws.com"

    .line 85
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "logs.ap-northeast-2.amazonaws.com"

    move-object/from16 v15, v21

    .line 86
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "polly.ap-northeast-2.amazonaws.com"

    .line 87
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "s3.ap-northeast-2.amazonaws.com"

    move-object/from16 v21, v9

    move-object/from16 v9, v22

    .line 88
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sns.ap-northeast-2.amazonaws.com"

    .line 89
    invoke-static {v1, v11, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sqs.ap-northeast-2.amazonaws.com"

    .line 90
    invoke-static {v1, v12, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sts.ap-northeast-2.amazonaws.com"

    .line 91
    invoke-static {v1, v13, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ap-south-1"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.ap-south-1.amazonaws.com"

    .line 95
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-identity.ap-south-1.amazonaws.com"

    .line 96
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-idp.ap-south-1.amazonaws.com"

    move-object/from16 v22, v14

    move-object/from16 v14, v16

    .line 98
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-sync.ap-south-1.amazonaws.com"

    .line 99
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "dynamodb.ap-south-1.amazonaws.com"

    .line 100
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ec2.ap-south-1.amazonaws.com"

    .line 101
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "elasticloadbalancing.ap-south-1.amazonaws.com"

    move-object/from16 v16, v5

    move-object/from16 v5, v18

    .line 102
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kinesis.ap-south-1.amazonaws.com"

    .line 104
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kms.ap-south-1.amazonaws.com"

    .line 105
    invoke-static {v1, v7, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "lambda.ap-south-1.amazonaws.com"

    .line 106
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "logs.ap-south-1.amazonaws.com"

    .line 107
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "polly.ap-south-1.amazonaws.com"

    move-object/from16 v18, v15

    move-object/from16 v15, v21

    .line 108
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "s3.ap-south-1.amazonaws.com"

    .line 109
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sns.ap-south-1.amazonaws.com"

    .line 110
    invoke-static {v1, v11, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sqs.ap-south-1.amazonaws.com"

    .line 111
    invoke-static {v1, v12, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sts.ap-south-1.amazonaws.com"

    .line 112
    invoke-static {v1, v13, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ap-southeast-1"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.ap-southeast-1.amazonaws.com"

    .line 116
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-identity.ap-southeast-1.amazonaws.com"

    move-object/from16 v21, v3

    move-object/from16 v3, v22

    .line 117
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-idp.ap-southeast-1.amazonaws.com"

    .line 119
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-sync.ap-southeast-1.amazonaws.com"

    .line 120
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "data.iot.ap-southeast-1.amazonaws.com"

    move-object/from16 v22, v10

    move-object/from16 v10, v17

    .line 122
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "dynamodb.ap-southeast-1.amazonaws.com"

    .line 123
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ec2.ap-southeast-1.amazonaws.com"

    move-object/from16 v17, v4

    move-object/from16 v4, v16

    .line 124
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "elasticloadbalancing.ap-southeast-1.amazonaws.com"

    .line 125
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "iot.ap-southeast-1.amazonaws.com"

    move-object/from16 v16, v5

    move-object/from16 v5, v20

    .line 127
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kinesis.ap-southeast-1.amazonaws.com"

    .line 128
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kms.ap-southeast-1.amazonaws.com"

    .line 129
    invoke-static {v1, v7, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "lambda.ap-southeast-1.amazonaws.com"

    .line 130
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "logs.ap-southeast-1.amazonaws.com"

    move-object/from16 v20, v8

    move-object/from16 v8, v18

    .line 131
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "polly.ap-southeast-1.amazonaws.com"

    .line 132
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "s3.ap-southeast-1.amazonaws.com"

    .line 133
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sdb.ap-southeast-1.amazonaws.com"

    move-object/from16 v18, v9

    move-object/from16 v9, v23

    .line 134
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sns.ap-southeast-1.amazonaws.com"

    .line 135
    invoke-static {v1, v11, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sqs.ap-southeast-1.amazonaws.com"

    .line 136
    invoke-static {v1, v12, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sts.ap-southeast-1.amazonaws.com"

    .line 137
    invoke-static {v1, v13, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ap-southeast-2"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "autoscaling.ap-southeast-2.amazonaws.com"

    move-object/from16 v23, v0

    move-object/from16 v0, v21

    .line 141
    invoke-static {v1, v0, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-identity.ap-southeast-2.amazonaws.com"

    .line 142
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-idp.ap-southeast-2.amazonaws.com"

    .line 144
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "cognito-sync.ap-southeast-2.amazonaws.com"

    move-object/from16 v21, v14

    move-object/from16 v14, v22

    .line 145
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "data.iot.ap-southeast-2.amazonaws.com"

    .line 147
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "dynamodb.ap-southeast-2.amazonaws.com"

    move-object/from16 v22, v10

    move-object/from16 v10, v17

    .line 148
    invoke-static {v1, v10, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "ec2.ap-southeast-2.amazonaws.com"

    .line 149
    invoke-static {v1, v4, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "elasticloadbalancing.ap-southeast-2.amazonaws.com"

    move-object/from16 v17, v14

    move-object/from16 v14, v16

    .line 150
    invoke-static {v1, v14, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "iot.ap-southeast-2.amazonaws.com"

    .line 152
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kinesis.ap-southeast-2.amazonaws.com"

    .line 153
    invoke-static {v1, v6, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "kms.ap-southeast-2.amazonaws.com"

    .line 154
    invoke-static {v1, v7, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "lambda.ap-southeast-2.amazonaws.com"

    move-object/from16 v16, v5

    move-object/from16 v5, v20

    .line 155
    invoke-static {v1, v5, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "logs.ap-southeast-2.amazonaws.com"

    .line 156
    invoke-static {v1, v8, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "polly.ap-southeast-2.amazonaws.com"

    .line 157
    invoke-static {v1, v15, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "s3.ap-southeast-2.amazonaws.com"

    move-object/from16 v20, v3

    move-object/from16 v3, v18

    .line 158
    invoke-static {v1, v3, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sdb.ap-southeast-2.amazonaws.com"

    .line 159
    invoke-static {v1, v9, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sns.ap-southeast-2.amazonaws.com"

    .line 160
    invoke-static {v1, v11, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sqs.ap-southeast-2.amazonaws.com"

    .line 161
    invoke-static {v1, v12, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sts.ap-southeast-2.amazonaws.com"

    .line 162
    invoke-static {v1, v13, v2}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v2, "ca-central-1"

    invoke-direct {v1, v2}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v23

    .line 165
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v23, v9

    const-string v9, "autoscaling.ca-central-1.amazonaws.com"

    .line 166
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.ca-central-1.amazonaws.com"

    .line 167
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.ca-central-1.amazonaws.com"

    .line 168
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.ca-central-1.amazonaws.com"

    .line 169
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.ca-central-1.amazonaws.com"

    .line 171
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.ca-central-1.amazonaws.com"

    .line 172
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.ca-central-1.amazonaws.com"

    .line 173
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.ca-central-1.amazonaws.com"

    .line 174
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.ca-central-1.amazonaws.com"

    .line 175
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.ca-central-1.amazonaws.com"

    .line 176
    invoke-static {v1, v3, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.ca-central-1.amazonaws.com"

    .line 177
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.ca-central-1.amazonaws.com"

    .line 178
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.ca-central-1.amazonaws.com"

    .line 179
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "eu-central-1"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 182
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.eu-central-1.amazonaws.com"

    .line 183
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-identity.eu-central-1.amazonaws.com"

    move-object/from16 v18, v0

    move-object/from16 v0, v20

    .line 184
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-idp.eu-central-1.amazonaws.com"

    move-object/from16 v0, v21

    .line 186
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-sync.eu-central-1.amazonaws.com"

    move-object/from16 v0, v17

    .line 187
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "data.iot.eu-central-1.amazonaws.com"

    move-object/from16 v0, v22

    .line 188
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.eu-central-1.amazonaws.com"

    .line 189
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.eu-central-1.amazonaws.com"

    .line 190
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.eu-central-1.amazonaws.com"

    .line 191
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "firehose.eu-central-1.amazonaws.com"

    move-object/from16 v22, v14

    move-object/from16 v14, v19

    .line 193
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "iot.eu-central-1.amazonaws.com"

    move-object/from16 v14, v16

    .line 194
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.eu-central-1.amazonaws.com"

    .line 195
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.eu-central-1.amazonaws.com"

    .line 196
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.eu-central-1.amazonaws.com"

    .line 197
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.eu-central-1.amazonaws.com"

    .line 198
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.eu-central-1.amazonaws.com"

    .line 199
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.eu-central-1.amazonaws.com"

    .line 200
    invoke-static {v1, v3, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.eu-central-1.amazonaws.com"

    .line 201
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.eu-central-1.amazonaws.com"

    .line 202
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.eu-central-1.amazonaws.com"

    .line 203
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "eu-central-2"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 207
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.eu-central-2.amazonaws.com"

    move-object/from16 v16, v2

    move-object/from16 v2, v18

    .line 208
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-identity.eu-central-2.amazonaws.com"

    move-object/from16 v2, v20

    .line 209
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-idp.eu-central-2.amazonaws.com"

    move-object/from16 v2, v21

    .line 211
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-sync.eu-central-2.amazonaws.com"

    move-object/from16 v2, v17

    .line 212
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "data.iot.eu-central-2.amazonaws.com"

    .line 214
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.eu-central-2.amazonaws.com"

    .line 215
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.eu-central-2.amazonaws.com"

    .line 216
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.eu-central-2.amazonaws.com"

    move-object/from16 v17, v0

    move-object/from16 v0, v22

    .line 217
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "firehose.eu-central-2.amazonaws.com"

    move-object/from16 v22, v2

    move-object/from16 v2, v19

    .line 219
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "iot.eu-central-2.amazonaws.com"

    .line 220
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.eu-central-2.amazonaws.com"

    .line 221
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.eu-central-2.amazonaws.com"

    .line 222
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.eu-central-2.amazonaws.com"

    .line 223
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.eu-central-2.amazonaws.com"

    .line 224
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.eu-central-2.amazonaws.com"

    .line 225
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.eu-central-2.amazonaws.com"

    .line 226
    invoke-static {v1, v3, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sdb.eu-central-2.amazonaws.com"

    move-object/from16 v19, v15

    move-object/from16 v15, v23

    .line 227
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.eu-central-2.amazonaws.com"

    .line 228
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.eu-central-2.amazonaws.com"

    .line 229
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.eu-central-2.amazonaws.com"

    .line 230
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "eu-south-1"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v9, v16

    .line 233
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v15, "autoscaling.eu-south-1.amazonaws.com"

    move-object/from16 v16, v7

    move-object/from16 v7, v18

    .line 234
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "dynamodb.eu-south-1.amazonaws.com"

    .line 235
    invoke-static {v1, v10, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "ec2.eu-south-1.amazonaws.com"

    .line 236
    invoke-static {v1, v4, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "elasticloadbalancing.eu-south-1.amazonaws.com"

    .line 237
    invoke-static {v1, v0, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "lambda.eu-south-1.amazonaws.com"

    .line 239
    invoke-static {v1, v5, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "logs.eu-south-1.amazonaws.com"

    .line 240
    invoke-static {v1, v8, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "s3.eu-south-1.amazonaws.com"

    .line 241
    invoke-static {v1, v3, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sns.eu-south-1.amazonaws.com"

    .line 242
    invoke-static {v1, v11, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sqs.eu-south-1.amazonaws.com"

    .line 243
    invoke-static {v1, v12, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sts.eu-south-1.amazonaws.com"

    .line 244
    invoke-static {v1, v13, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v15, "eu-south-2"

    invoke-direct {v1, v15}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 248
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v15, "autoscaling.eu-south-2.amazonaws.com"

    .line 249
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "cognito-identity.eu-south-2.amazonaws.com"

    move-object/from16 v7, v20

    .line 250
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "cognito-idp.eu-south-2.amazonaws.com"

    move-object/from16 v7, v21

    .line 252
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "cognito-sync.eu-south-2.amazonaws.com"

    move-object/from16 v7, v22

    .line 253
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "data.iot.eu-south-2.amazonaws.com"

    move-object/from16 v7, v17

    .line 255
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "dynamodb.eu-south-2.amazonaws.com"

    .line 256
    invoke-static {v1, v10, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "ec2.eu-south-2.amazonaws.com"

    .line 257
    invoke-static {v1, v4, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "elasticloadbalancing.eu-south-2.amazonaws.com"

    .line 258
    invoke-static {v1, v0, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "firehose.eu-south-2.amazonaws.com"

    .line 260
    invoke-static {v1, v2, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "iot.eu-south-2.amazonaws.com"

    .line 261
    invoke-static {v1, v14, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "kinesis.eu-south-2.amazonaws.com"

    .line 262
    invoke-static {v1, v6, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "kms.eu-south-2.amazonaws.com"

    move-object/from16 v17, v6

    move-object/from16 v6, v16

    .line 263
    invoke-static {v1, v6, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "lambda.eu-south-2.amazonaws.com"

    .line 264
    invoke-static {v1, v5, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "logs.eu-south-2.amazonaws.com"

    .line 265
    invoke-static {v1, v8, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "polly.eu-south-2.amazonaws.com"

    move-object/from16 v16, v8

    move-object/from16 v8, v19

    .line 266
    invoke-static {v1, v8, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "s3.eu-south-2.amazonaws.com"

    .line 267
    invoke-static {v1, v3, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sdb.eu-south-2.amazonaws.com"

    move-object/from16 v19, v3

    move-object/from16 v3, v23

    .line 268
    invoke-static {v1, v3, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sns.eu-south-2.amazonaws.com"

    .line 269
    invoke-static {v1, v11, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sqs.eu-south-2.amazonaws.com"

    .line 270
    invoke-static {v1, v12, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sts.eu-south-2.amazonaws.com"

    .line 271
    invoke-static {v1, v13, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v15, "eu-west-1"

    invoke-direct {v1, v15}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 274
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v15, "autoscaling.eu-west-1.amazonaws.com"

    move-object/from16 v23, v9

    move-object/from16 v9, v18

    .line 275
    invoke-static {v1, v9, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "cognito-identity.eu-west-1.amazonaws.com"

    move-object/from16 v9, v20

    .line 276
    invoke-static {v1, v9, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "cognito-idp.eu-west-1.amazonaws.com"

    move-object/from16 v9, v21

    .line 278
    invoke-static {v1, v9, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "cognito-sync.eu-west-1.amazonaws.com"

    move-object/from16 v9, v22

    .line 279
    invoke-static {v1, v9, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "data.iot.eu-west-1.amazonaws.com"

    .line 280
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "dynamodb.eu-west-1.amazonaws.com"

    .line 281
    invoke-static {v1, v10, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "ec2.eu-west-1.amazonaws.com"

    .line 282
    invoke-static {v1, v4, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "elasticloadbalancing.eu-west-1.amazonaws.com"

    .line 283
    invoke-static {v1, v0, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "email.eu-west-1.amazonaws.com"

    move-object/from16 v22, v7

    const-string v7, "email"

    .line 285
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "firehose.eu-west-1.amazonaws.com"

    .line 286
    invoke-static {v1, v2, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "iot.eu-west-1.amazonaws.com"

    .line 287
    invoke-static {v1, v14, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "kinesis.eu-west-1.amazonaws.com"

    move-object/from16 v24, v2

    move-object/from16 v2, v17

    .line 288
    invoke-static {v1, v2, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "kms.eu-west-1.amazonaws.com"

    .line 289
    invoke-static {v1, v6, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "lambda.eu-west-1.amazonaws.com"

    .line 290
    invoke-static {v1, v5, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "logs.eu-west-1.amazonaws.com"

    move-object/from16 v17, v7

    move-object/from16 v7, v16

    .line 291
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "machinelearning.eu-west-1.amazonaws.com"

    const-string v7, "machinelearning"

    .line 292
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "polly.eu-west-1.amazonaws.com"

    .line 294
    invoke-static {v1, v8, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "rekognition.eu-west-1.amazonaws.com"

    move-object/from16 v25, v7

    const-string v7, "rekognition"

    .line 295
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "s3.eu-west-1.amazonaws.com"

    move-object/from16 v26, v7

    move-object/from16 v7, v19

    .line 296
    invoke-static {v1, v7, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sdb.eu-west-1.amazonaws.com"

    .line 297
    invoke-static {v1, v3, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sns.eu-west-1.amazonaws.com"

    .line 298
    invoke-static {v1, v11, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sqs.eu-west-1.amazonaws.com"

    .line 299
    invoke-static {v1, v12, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v15, "sts.eu-west-1.amazonaws.com"

    .line 300
    invoke-static {v1, v13, v15}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v15, "eu-west-2"

    invoke-direct {v1, v15}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v15, v23

    .line 303
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v23, v3

    const-string v3, "autoscaling.eu-west-2.amazonaws.com"

    move-object/from16 v19, v15

    move-object/from16 v15, v18

    .line 304
    invoke-static {v1, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "cognito-identity.eu-west-2.amazonaws.com"

    move-object/from16 v15, v20

    .line 305
    invoke-static {v1, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "cognito-idp.eu-west-2.amazonaws.com"

    move-object/from16 v15, v21

    .line 307
    invoke-static {v1, v15, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "cognito-sync.eu-west-2.amazonaws.com"

    .line 308
    invoke-static {v1, v9, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "dynamodb.eu-west-2.amazonaws.com"

    .line 309
    invoke-static {v1, v10, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "ec2.eu-west-2.amazonaws.com"

    .line 310
    invoke-static {v1, v4, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "elasticloadbalancing.eu-west-2.amazonaws.com"

    .line 311
    invoke-static {v1, v0, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "iot.eu-west-2.amazonaws.com"

    .line 313
    invoke-static {v1, v14, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "kinesis.eu-west-2.amazonaws.com"

    .line 314
    invoke-static {v1, v2, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "kms.eu-west-2.amazonaws.com"

    .line 315
    invoke-static {v1, v6, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "lambda.eu-west-2.amazonaws.com"

    .line 316
    invoke-static {v1, v5, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "logs.eu-west-2.amazonaws.com"

    move-object/from16 v21, v14

    move-object/from16 v14, v16

    .line 317
    invoke-static {v1, v14, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "polly.eu-west-2.amazonaws.com"

    .line 318
    invoke-static {v1, v8, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "s3.eu-west-2.amazonaws.com"

    .line 319
    invoke-static {v1, v7, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "sns.eu-west-2.amazonaws.com"

    .line 320
    invoke-static {v1, v11, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "sqs.eu-west-2.amazonaws.com"

    .line 321
    invoke-static {v1, v12, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "sts.eu-west-2.amazonaws.com"

    .line 322
    invoke-static {v1, v13, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v3, "eu-west-3"

    invoke-direct {v1, v3}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v3, v19

    .line 325
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v9

    const-string v9, "autoscaling.eu-west-3.amazonaws.com"

    move-object/from16 v19, v15

    move-object/from16 v15, v18

    .line 326
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.eu-west-3.amazonaws.com"

    .line 327
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.eu-west-3.amazonaws.com"

    .line 328
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.eu-west-3.amazonaws.com"

    .line 329
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.eu-west-3.amazonaws.com"

    .line 331
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.eu-west-3.amazonaws.com"

    .line 332
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.eu-west-3.amazonaws.com"

    .line 333
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.eu-west-3.amazonaws.com"

    .line 334
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.eu-west-3.amazonaws.com"

    .line 335
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.eu-west-3.amazonaws.com"

    .line 336
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.eu-west-3.amazonaws.com"

    .line 337
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.eu-west-3.amazonaws.com"

    .line 338
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.eu-west-3.amazonaws.com"

    .line 339
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "sa-east-1"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 342
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.sa-east-1.amazonaws.com"

    .line 343
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.sa-east-1.amazonaws.com"

    .line 344
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.sa-east-1.amazonaws.com"

    .line 345
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.sa-east-1.amazonaws.com"

    .line 346
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.sa-east-1.amazonaws.com"

    .line 348
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.sa-east-1.amazonaws.com"

    .line 349
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.sa-east-1.amazonaws.com"

    .line 350
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.sa-east-1.amazonaws.com"

    .line 351
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.sa-east-1.amazonaws.com"

    .line 352
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.sa-east-1.amazonaws.com"

    .line 353
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sdb.sa-east-1.amazonaws.com"

    move-object/from16 v18, v7

    move-object/from16 v7, v23

    .line 354
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.sa-east-1.amazonaws.com"

    .line 355
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.sa-east-1.amazonaws.com"

    .line 356
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.sa-east-1.amazonaws.com"

    .line 357
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "us-east-1"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 360
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.us-east-1.amazonaws.com"

    .line 361
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-identity.us-east-1.amazonaws.com"

    move-object/from16 v23, v15

    move-object/from16 v15, v20

    .line 362
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-idp.us-east-1.amazonaws.com"

    move-object/from16 v15, v19

    .line 364
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-sync.us-east-1.amazonaws.com"

    move-object/from16 v15, v16

    .line 365
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "data.iot.us-east-1.amazonaws.com"

    move-object/from16 v15, v22

    .line 366
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.us-east-1.amazonaws.com"

    .line 367
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.us-east-1.amazonaws.com"

    .line 368
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.us-east-1.amazonaws.com"

    .line 369
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "email.us-east-1.amazonaws.com"

    move-object/from16 v15, v17

    .line 371
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "firehose.us-east-1.amazonaws.com"

    move-object/from16 v15, v24

    .line 372
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "iot.us-east-1.amazonaws.com"

    move-object/from16 v15, v21

    .line 373
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.us-east-1.amazonaws.com"

    .line 374
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.us-east-1.amazonaws.com"

    .line 375
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.us-east-1.amazonaws.com"

    .line 376
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.us-east-1.amazonaws.com"

    .line 377
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "machinelearning.us-east-1.amazonaws.com"

    move-object/from16 v21, v14

    move-object/from16 v14, v25

    .line 378
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "mobileanalytics"

    const-string v14, "mobileanalytics.us-east-1.amazonaws.com"

    .line 380
    invoke-static {v1, v9, v14}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "pinpoint"

    const-string v14, "pinpoint.us-east-1.amazonaws.com"

    .line 382
    invoke-static {v1, v9, v14}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.us-east-1.amazonaws.com"

    .line 383
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "rekognition.us-east-1.amazonaws.com"

    move-object/from16 v14, v26

    .line 384
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.amazonaws.com"

    move-object/from16 v14, v18

    .line 385
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sdb.amazonaws.com"

    .line 386
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.us-east-1.amazonaws.com"

    .line 387
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.us-east-1.amazonaws.com"

    .line 388
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.us-east-1.amazonaws.com"

    .line 389
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "us-east-2"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 392
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.us-east-2.amazonaws.com"

    move-object/from16 v18, v7

    move-object/from16 v7, v23

    .line 393
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-identity.us-east-2.amazonaws.com"

    move-object/from16 v7, v20

    .line 394
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-idp.us-east-2.amazonaws.com"

    move-object/from16 v7, v19

    .line 396
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-sync.us-east-2.amazonaws.com"

    move-object/from16 v7, v16

    .line 397
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.us-east-2.amazonaws.com"

    .line 398
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.us-east-2.amazonaws.com"

    .line 399
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.us-east-2.amazonaws.com"

    .line 400
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "firehose.us-east-2.amazonaws.com"

    move-object/from16 v7, v24

    .line 402
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "iot.us-east-2.amazonaws.com"

    .line 403
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.us-east-2.amazonaws.com"

    .line 404
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.us-east-2.amazonaws.com"

    .line 405
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.us-east-2.amazonaws.com"

    .line 406
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.us-east-2.amazonaws.com"

    move-object/from16 v24, v15

    move-object/from16 v15, v21

    .line 407
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.us-east-2.amazonaws.com"

    .line 408
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.us-east-2.amazonaws.com"

    .line 409
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.us-east-2.amazonaws.com"

    .line 410
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.us-east-2.amazonaws.com"

    .line 411
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.us-east-2.amazonaws.com"

    .line 412
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "us-west-1"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 415
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.us-west-1.amazonaws.com"

    move-object/from16 v21, v7

    move-object/from16 v7, v23

    .line 416
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.us-west-1.amazonaws.com"

    .line 417
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.us-west-1.amazonaws.com"

    .line 418
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.us-west-1.amazonaws.com"

    .line 419
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kinesis.us-west-1.amazonaws.com"

    .line 421
    invoke-static {v1, v2, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "kms.us-west-1.amazonaws.com"

    .line 422
    invoke-static {v1, v6, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "lambda.us-west-1.amazonaws.com"

    .line 423
    invoke-static {v1, v5, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "logs.us-west-1.amazonaws.com"

    .line 424
    invoke-static {v1, v15, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "polly.us-west-1.amazonaws.com"

    .line 425
    invoke-static {v1, v8, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "s3.us-west-1.amazonaws.com"

    .line 426
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sdb.us-west-1.amazonaws.com"

    move-object/from16 v23, v14

    move-object/from16 v14, v18

    .line 427
    invoke-static {v1, v14, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sns.us-west-1.amazonaws.com"

    .line 428
    invoke-static {v1, v11, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sqs.us-west-1.amazonaws.com"

    .line 429
    invoke-static {v1, v12, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "sts.us-west-1.amazonaws.com"

    .line 430
    invoke-static {v1, v13, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v9, "us-west-2"

    invoke-direct {v1, v9}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 433
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "autoscaling.us-west-2.amazonaws.com"

    .line 434
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-identity.us-west-2.amazonaws.com"

    move-object/from16 v18, v7

    move-object/from16 v7, v20

    .line 435
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-idp.us-west-2.amazonaws.com"

    move-object/from16 v7, v19

    .line 437
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "cognito-sync.us-west-2.amazonaws.com"

    move-object/from16 v7, v16

    .line 438
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "data.iot.us-west-2.amazonaws.com"

    move-object/from16 v7, v22

    .line 439
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "dynamodb.us-west-2.amazonaws.com"

    .line 440
    invoke-static {v1, v10, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ec2.us-west-2.amazonaws.com"

    .line 441
    invoke-static {v1, v4, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "elasticloadbalancing.us-west-2.amazonaws.com"

    .line 442
    invoke-static {v1, v0, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "email.us-west-2.amazonaws.com"

    move-object/from16 v7, v17

    .line 444
    invoke-static {v1, v7, v9}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.us-west-2.amazonaws.com"

    move-object/from16 v9, v21

    .line 445
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.us-west-2.amazonaws.com"

    move-object/from16 v9, v24

    .line 446
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.us-west-2.amazonaws.com"

    .line 447
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.us-west-2.amazonaws.com"

    .line 448
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.us-west-2.amazonaws.com"

    .line 449
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.us-west-2.amazonaws.com"

    .line 450
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.us-west-2.amazonaws.com"

    .line 451
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "rekognition.us-west-2.amazonaws.com"

    move-object/from16 v17, v8

    move-object/from16 v8, v26

    .line 452
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.us-west-2.amazonaws.com"

    move-object/from16 v8, v23

    .line 453
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.us-west-2.amazonaws.com"

    .line 454
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.us-west-2.amazonaws.com"

    .line 455
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.us-west-2.amazonaws.com"

    .line 456
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.us-west-2.amazonaws.com"

    .line 457
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 459
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "cn-north-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 460
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.cn-north-1.amazonaws.com.cn"

    move-object/from16 v23, v14

    move-object/from16 v14, v18

    .line 461
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.cn-north-1.amazonaws.com.cn"

    move-object/from16 v18, v6

    move-object/from16 v6, v20

    .line 462
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.cn-north-1.amazonaws.com.cn"

    .line 464
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.cn-north-1.amazonaws.com.cn"

    .line 465
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.cn-north-1.amazonaws.com.cn"

    .line 466
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.cn-north-1.amazonaws.com.cn"

    .line 468
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.cn-north-1.amazonaws.com.cn"

    .line 469
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.cn-north-1.amazonaws.com.cn"

    .line 470
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.cn-north-1.amazonaws.com.cn"

    .line 471
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.cn-north-1.amazonaws.com.cn"

    .line 472
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.cn-north-1.amazonaws.com.cn"

    .line 473
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.cn-north-1.amazonaws.com.cn"

    .line 474
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.cn-north-1.amazonaws.com.cn"

    .line 475
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "cn-northwest-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 478
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.cn-northwest-1.amazonaws.com.cn"

    .line 479
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.cn-northwest-1.amazonaws.com.cn"

    .line 481
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.cn-northwest-1.amazonaws.com.cn"

    .line 482
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn"

    .line 483
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.cn-northwest-1.amazonaws.com.cn"

    .line 485
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.cn-northwest-1.amazonaws.com.cn"

    .line 486
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.cn-northwest-1.amazonaws.com.cn"

    .line 487
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.cn-northwest-1.amazonaws.com.cn"

    .line 488
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.cn-northwest-1.amazonaws.com.cn"

    .line 489
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.cn-northwest-1.amazonaws.com.cn"

    .line 490
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "us-gov-west-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 493
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.us-gov-west-1.amazonaws.com"

    .line 494
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.us-gov-west-1.amazonaws.com"

    .line 495
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.us-gov-west-1.amazonaws.com"

    .line 496
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.us-gov-west-1.amazonaws.com"

    .line 497
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.us-gov-west-1.amazonaws.com"

    .line 499
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.us-gov-west-1.amazonaws.com"

    move-object/from16 v6, v18

    .line 500
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.us-gov-west-1.amazonaws.com"

    .line 501
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.us-gov-west-1.amazonaws.com"

    .line 502
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "rekognition.us-gov-west-1.amazonaws.com"

    move-object/from16 v9, v26

    .line 503
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.us-gov-west-1.amazonaws.com"

    .line 504
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.us-gov-west-1.amazonaws.com"

    .line 505
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.us-gov-west-1.amazonaws.com"

    .line 506
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.us-gov-west-1.amazonaws.com"

    .line 507
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "us-gov-east-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 510
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.us-gov-east-1.amazonaws.com"

    .line 511
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.us-gov-east-1.amazonaws.com"

    .line 512
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.us-gov-east-1.amazonaws.com"

    .line 513
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.us-gov-east-1.amazonaws.com"

    .line 514
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.us-gov-east-1.amazonaws.com"

    .line 516
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.us-gov-east-1.amazonaws.com"

    .line 517
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.us-gov-east-1.amazonaws.com"

    .line 518
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.us-gov-east-1.amazonaws.com"

    .line 519
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "rekognition.us-gov-east-1.amazonaws.com"

    .line 520
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.us-gov-east-1.amazonaws.com"

    .line 521
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.us-gov-east-1.amazonaws.com"

    .line 522
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.us-gov-east-1.amazonaws.com"

    .line 523
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.us-gov-east-1.amazonaws.com"

    .line 524
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "eu-north-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 527
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.eu-north-1.amazonaws.com"

    .line 528
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.eu-north-1.amazonaws.com"

    .line 529
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.eu-north-1.amazonaws.com"

    .line 530
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.eu-north-1.amazonaws.com"

    .line 531
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.eu-north-1.amazonaws.com"

    move-object/from16 v9, v21

    .line 533
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.eu-north-1.amazonaws.com"

    move-object/from16 v9, v24

    .line 534
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.eu-north-1.amazonaws.com"

    .line 535
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.eu-north-1.amazonaws.com"

    .line 536
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.eu-north-1.amazonaws.com"

    .line 537
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.eu-north-1.amazonaws.com"

    .line 538
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.eu-north-1.amazonaws.com"

    .line 539
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.eu-north-1.amazonaws.com"

    .line 540
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.eu-north-1.amazonaws.com"

    .line 541
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.eu-north-1.amazonaws.com"

    .line 542
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-east-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 545
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-east-1.amazonaws.com"

    .line 546
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-east-1.amazonaws.com"

    .line 547
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-east-1.amazonaws.com"

    .line 548
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-east-1.amazonaws.com"

    .line 549
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-east-1.amazonaws.com"

    move-object/from16 v9, v21

    .line 551
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-east-1.amazonaws.com"

    .line 552
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-east-1.amazonaws.com"

    .line 553
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-east-1.amazonaws.com"

    .line 554
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-east-1.amazonaws.com"

    .line 555
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-east-1.amazonaws.com"

    move-object/from16 v21, v15

    move-object/from16 v15, v17

    .line 556
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-east-1.amazonaws.com"

    .line 557
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-east-1.amazonaws.com"

    .line 558
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-east-1.amazonaws.com"

    .line 559
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-east-1.amazonaws.com"

    .line 560
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 563
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-east-2"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 564
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-east-2.amazonaws.com"

    .line 565
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ap-east-2.amazonaws.com"

    move-object/from16 v18, v14

    move-object/from16 v14, v20

    .line 566
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ap-east-2.amazonaws.com"

    move-object/from16 v14, v19

    .line 568
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ap-east-2.amazonaws.com"

    move-object/from16 v14, v16

    .line 569
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ap-east-2.amazonaws.com"

    move-object/from16 v17, v14

    move-object/from16 v14, v22

    .line 571
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-east-2.amazonaws.com"

    .line 572
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-east-2.amazonaws.com"

    .line 573
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-east-2.amazonaws.com"

    .line 574
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-east-2.amazonaws.com"

    .line 576
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.ap-east-2.amazonaws.com"

    move-object/from16 v16, v9

    move-object/from16 v9, v24

    .line 577
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-east-2.amazonaws.com"

    .line 578
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-east-2.amazonaws.com"

    .line 579
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-east-2.amazonaws.com"

    .line 580
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-east-2.amazonaws.com"

    move-object/from16 v22, v5

    move-object/from16 v5, v21

    .line 581
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-east-2.amazonaws.com"

    .line 582
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-east-2.amazonaws.com"

    .line 583
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.ap-east-2.amazonaws.com"

    move-object/from16 v21, v8

    move-object/from16 v8, v23

    .line 584
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-east-2.amazonaws.com"

    .line 585
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-east-2.amazonaws.com"

    .line 586
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-east-2.amazonaws.com"

    .line 587
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 590
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "me-south-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    .line 591
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.me-south-1.amazonaws.com"

    move-object/from16 v23, v3

    move-object/from16 v3, v18

    .line 592
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.me-south-1.amazonaws.com"

    move-object/from16 v3, v20

    .line 593
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.me-south-1.amazonaws.com"

    move-object/from16 v3, v19

    .line 595
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.me-south-1.amazonaws.com"

    move-object/from16 v3, v17

    .line 596
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.me-south-1.amazonaws.com"

    .line 598
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.me-south-1.amazonaws.com"

    .line 599
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.me-south-1.amazonaws.com"

    .line 600
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.me-south-1.amazonaws.com"

    .line 601
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.me-south-1.amazonaws.com"

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    .line 603
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.me-south-1.amazonaws.com"

    .line 604
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.me-south-1.amazonaws.com"

    .line 605
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.me-south-1.amazonaws.com"

    .line 606
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.me-south-1.amazonaws.com"

    move-object/from16 v16, v6

    move-object/from16 v6, v22

    .line 607
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.me-south-1.amazonaws.com"

    .line 608
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.me-south-1.amazonaws.com"

    .line 609
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.me-south-1.amazonaws.com"

    move-object/from16 v22, v15

    move-object/from16 v15, v21

    .line 610
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.me-south-1.amazonaws.com"

    .line 611
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.me-south-1.amazonaws.com"

    .line 612
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.me-south-1.amazonaws.com"

    .line 613
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.me-south-1.amazonaws.com"

    .line 614
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-southeast-3"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 618
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-southeast-3.amazonaws.com"

    move-object/from16 v21, v13

    move-object/from16 v13, v18

    .line 619
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ap-southeast-3.amazonaws.com"

    move-object/from16 v13, v20

    .line 620
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ap-southeast-3.amazonaws.com"

    move-object/from16 v13, v19

    .line 622
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ap-southeast-3.amazonaws.com"

    .line 623
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ap-southeast-3.amazonaws.com"

    .line 625
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-southeast-3.amazonaws.com"

    .line 626
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-southeast-3.amazonaws.com"

    .line 627
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-southeast-3.amazonaws.com"

    move-object/from16 v19, v4

    move-object/from16 v4, v17

    .line 628
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-southeast-3.amazonaws.com"

    .line 630
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.ap-southeast-3.amazonaws.com"

    .line 631
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-southeast-3.amazonaws.com"

    .line 632
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-southeast-3.amazonaws.com"

    move-object/from16 v17, v2

    move-object/from16 v2, v16

    .line 633
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-southeast-3.amazonaws.com"

    .line 634
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-southeast-3.amazonaws.com"

    .line 635
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-southeast-3.amazonaws.com"

    move-object/from16 v16, v5

    move-object/from16 v5, v22

    .line 636
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-southeast-3.amazonaws.com"

    .line 637
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.ap-southeast-3.amazonaws.com"

    .line 638
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-southeast-3.amazonaws.com"

    .line 639
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-southeast-3.amazonaws.com"

    .line 640
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-southeast-3.amazonaws.com"

    move-object/from16 v22, v12

    move-object/from16 v12, v21

    .line 641
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "me-central-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 645
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.me-central-1.amazonaws.com"

    move-object/from16 v12, v18

    .line 646
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.me-central-1.amazonaws.com"

    move-object/from16 v12, v20

    .line 647
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.me-central-1.amazonaws.com"

    .line 649
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.me-central-1.amazonaws.com"

    .line 650
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.me-central-1.amazonaws.com"

    .line 652
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.me-central-1.amazonaws.com"

    .line 653
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.me-central-1.amazonaws.com"

    move-object/from16 v20, v10

    move-object/from16 v10, v19

    .line 654
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.me-central-1.amazonaws.com"

    .line 655
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.me-central-1.amazonaws.com"

    .line 657
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.me-central-1.amazonaws.com"

    .line 658
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.me-central-1.amazonaws.com"

    move-object/from16 v9, v17

    .line 659
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.me-central-1.amazonaws.com"

    .line 660
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.me-central-1.amazonaws.com"

    .line 661
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.me-central-1.amazonaws.com"

    move-object/from16 v17, v6

    move-object/from16 v6, v16

    .line 662
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.me-central-1.amazonaws.com"

    .line 663
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.me-central-1.amazonaws.com"

    .line 664
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.me-central-1.amazonaws.com"

    .line 665
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.me-central-1.amazonaws.com"

    .line 666
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.me-central-1.amazonaws.com"

    move-object/from16 v16, v11

    move-object/from16 v11, v22

    .line 667
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.me-central-1.amazonaws.com"

    move-object/from16 v11, v21

    .line 668
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 671
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-south-2"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 672
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-south-2.amazonaws.com"

    move-object/from16 v11, v18

    .line 673
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ap-south-2.amazonaws.com"

    .line 674
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ap-south-2.amazonaws.com"

    .line 676
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ap-south-2.amazonaws.com"

    .line 677
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ap-south-2.amazonaws.com"

    .line 679
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-south-2.amazonaws.com"

    move-object/from16 v18, v14

    move-object/from16 v14, v20

    .line 680
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-south-2.amazonaws.com"

    .line 681
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-south-2.amazonaws.com"

    .line 682
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-south-2.amazonaws.com"

    .line 684
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.ap-south-2.amazonaws.com"

    move-object/from16 v19, v0

    move-object/from16 v0, v24

    .line 685
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-south-2.amazonaws.com"

    .line 686
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-south-2.amazonaws.com"

    .line 687
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-south-2.amazonaws.com"

    move-object/from16 v20, v2

    move-object/from16 v2, v17

    .line 688
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-south-2.amazonaws.com"

    .line 689
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-south-2.amazonaws.com"

    .line 690
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-south-2.amazonaws.com"

    .line 691
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.ap-south-2.amazonaws.com"

    .line 692
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-south-2.amazonaws.com"

    move-object/from16 v17, v8

    move-object/from16 v8, v16

    .line 693
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-south-2.amazonaws.com"

    move-object/from16 v8, v22

    .line 694
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-south-2.amazonaws.com"

    move-object/from16 v8, v21

    .line 695
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-southeast-4"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 700
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-southeast-4.amazonaws.com"

    .line 701
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ap-southeast-4.amazonaws.com"

    .line 702
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ap-southeast-4.amazonaws.com"

    .line 704
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ap-southeast-4.amazonaws.com"

    .line 705
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ap-southeast-4.amazonaws.com"

    move-object/from16 v21, v3

    move-object/from16 v3, v18

    .line 707
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-southeast-4.amazonaws.com"

    .line 708
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-southeast-4.amazonaws.com"

    .line 709
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-southeast-4.amazonaws.com"

    .line 710
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-southeast-4.amazonaws.com"

    move-object/from16 v18, v4

    move-object/from16 v4, v19

    .line 712
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.ap-southeast-4.amazonaws.com"

    .line 713
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-southeast-4.amazonaws.com"

    .line 714
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-southeast-4.amazonaws.com"

    move-object/from16 v19, v9

    move-object/from16 v9, v20

    .line 715
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-southeast-4.amazonaws.com"

    .line 716
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-southeast-4.amazonaws.com"

    .line 717
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-southeast-4.amazonaws.com"

    .line 718
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-southeast-4.amazonaws.com"

    .line 719
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.ap-southeast-4.amazonaws.com"

    move-object/from16 v20, v15

    move-object/from16 v15, v17

    .line 720
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-southeast-4.amazonaws.com"

    move-object/from16 v15, v16

    .line 721
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-southeast-4.amazonaws.com"

    move-object/from16 v15, v22

    .line 722
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-southeast-4.amazonaws.com"

    .line 723
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-southeast-5"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 727
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-southeast-5.amazonaws.com"

    .line 728
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ap-southeast-5.amazonaws.com"

    .line 729
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ap-southeast-5.amazonaws.com"

    .line 731
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ap-southeast-5.amazonaws.com"

    move-object/from16 v22, v13

    move-object/from16 v13, v21

    .line 732
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ap-southeast-5.amazonaws.com"

    .line 734
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-southeast-5.amazonaws.com"

    .line 735
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-southeast-5.amazonaws.com"

    .line 736
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-southeast-5.amazonaws.com"

    move-object/from16 v21, v10

    move-object/from16 v10, v18

    .line 737
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-southeast-5.amazonaws.com"

    .line 739
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.ap-southeast-5.amazonaws.com"

    .line 740
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-southeast-5.amazonaws.com"

    move-object/from16 v0, v19

    .line 741
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-southeast-5.amazonaws.com"

    .line 742
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-southeast-5.amazonaws.com"

    .line 743
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-southeast-5.amazonaws.com"

    .line 744
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-southeast-5.amazonaws.com"

    .line 745
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-southeast-5.amazonaws.com"

    move-object/from16 v19, v5

    move-object/from16 v5, v20

    .line 746
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.ap-southeast-5.amazonaws.com"

    move-object/from16 v18, v5

    move-object/from16 v5, v17

    .line 747
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-southeast-5.amazonaws.com"

    move-object/from16 v5, v16

    .line 748
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-southeast-5.amazonaws.com"

    .line 749
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-southeast-5.amazonaws.com"

    .line 750
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ap-southeast-7"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 754
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ap-southeast-7.amazonaws.com"

    .line 755
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ap-southeast-7.amazonaws.com"

    .line 756
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ap-southeast-7.amazonaws.com"

    move-object/from16 v20, v12

    move-object/from16 v12, v22

    .line 758
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ap-southeast-7.amazonaws.com"

    .line 759
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ap-southeast-7.amazonaws.com"

    .line 761
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ap-southeast-7.amazonaws.com"

    .line 762
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.ap-southeast-7.amazonaws.com"

    move-object/from16 v16, v14

    move-object/from16 v14, v21

    .line 763
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.ap-southeast-7.amazonaws.com"

    .line 764
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.ap-southeast-7.amazonaws.com"

    .line 766
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.ap-southeast-7.amazonaws.com"

    move-object/from16 v21, v4

    move-object/from16 v4, v24

    .line 767
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.ap-southeast-7.amazonaws.com"

    .line 768
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.ap-southeast-7.amazonaws.com"

    .line 769
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.ap-southeast-7.amazonaws.com"

    .line 770
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.ap-southeast-7.amazonaws.com"

    .line 771
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.ap-southeast-7.amazonaws.com"

    move-object/from16 v22, v6

    move-object/from16 v6, v19

    .line 772
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.ap-southeast-7.amazonaws.com"

    move-object/from16 v6, v18

    .line 773
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.ap-southeast-7.amazonaws.com"

    move-object/from16 v6, v17

    .line 774
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.ap-southeast-7.amazonaws.com"

    .line 775
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.ap-southeast-7.amazonaws.com"

    .line 776
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.ap-southeast-7.amazonaws.com"

    .line 777
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "mx-central-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 781
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.mx-central-1.amazonaws.com"

    .line 782
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.mx-central-1.amazonaws.com"

    move-object/from16 v17, v11

    move-object/from16 v11, v20

    .line 783
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.mx-central-1.amazonaws.com"

    .line 785
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.mx-central-1.amazonaws.com"

    .line 786
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.mx-central-1.amazonaws.com"

    .line 788
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.mx-central-1.amazonaws.com"

    move-object/from16 v20, v3

    move-object/from16 v3, v16

    .line 789
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.mx-central-1.amazonaws.com"

    .line 790
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.mx-central-1.amazonaws.com"

    .line 791
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.mx-central-1.amazonaws.com"

    move-object/from16 v16, v10

    move-object/from16 v10, v21

    .line 793
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.mx-central-1.amazonaws.com"

    .line 794
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.mx-central-1.amazonaws.com"

    .line 795
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.mx-central-1.amazonaws.com"

    .line 796
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.mx-central-1.amazonaws.com"

    .line 797
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.mx-central-1.amazonaws.com"

    move-object/from16 v21, v2

    move-object/from16 v2, v22

    .line 798
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.mx-central-1.amazonaws.com"

    move-object/from16 v2, v19

    .line 799
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.mx-central-1.amazonaws.com"

    move-object/from16 v2, v18

    .line 800
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.mx-central-1.amazonaws.com"

    .line 801
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.mx-central-1.amazonaws.com"

    .line 802
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.mx-central-1.amazonaws.com"

    .line 803
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.mx-central-1.amazonaws.com"

    .line 804
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 807
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "il-central-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 808
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.il-central-1.amazonaws.com"

    move-object/from16 v18, v8

    move-object/from16 v8, v17

    .line 809
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.il-central-1.amazonaws.com"

    .line 810
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.il-central-1.amazonaws.com"

    .line 812
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.il-central-1.amazonaws.com"

    .line 813
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.il-central-1.amazonaws.com"

    move-object/from16 v17, v13

    move-object/from16 v13, v20

    .line 815
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.il-central-1.amazonaws.com"

    .line 816
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "ec2.il-central-1.amazonaws.com"

    .line 817
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "elasticloadbalancing.il-central-1.amazonaws.com"

    move-object/from16 v20, v14

    move-object/from16 v14, v16

    .line 818
    invoke-static {v1, v14, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "firehose.il-central-1.amazonaws.com"

    .line 820
    invoke-static {v1, v10, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "iot.il-central-1.amazonaws.com"

    .line 821
    invoke-static {v1, v4, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kinesis.il-central-1.amazonaws.com"

    .line 822
    invoke-static {v1, v0, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "kms.il-central-1.amazonaws.com"

    .line 823
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "lambda.il-central-1.amazonaws.com"

    move-object/from16 v16, v9

    move-object/from16 v9, v21

    .line 824
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "logs.il-central-1.amazonaws.com"

    move-object/from16 v9, v22

    .line 825
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "polly.il-central-1.amazonaws.com"

    move-object/from16 v9, v19

    .line 826
    invoke-static {v1, v9, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "s3.il-central-1.amazonaws.com"

    .line 827
    invoke-static {v1, v2, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sdb.il-central-1.amazonaws.com"

    .line 828
    invoke-static {v1, v6, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sns.il-central-1.amazonaws.com"

    .line 829
    invoke-static {v1, v5, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sqs.il-central-1.amazonaws.com"

    .line 830
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "sts.il-central-1.amazonaws.com"

    move-object/from16 v19, v15

    move-object/from16 v15, v18

    .line 831
    invoke-static {v1, v15, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    .line 835
    new-instance v1, Lcom/amazonaws/regions/Region;

    const-string v7, "ca-west-1"

    invoke-direct {v1, v7}, Lcom/amazonaws/regions/Region;-><init>(Ljava/lang/String;)V

    move-object/from16 v7, v23

    .line 836
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "autoscaling.ca-west-1.amazonaws.com"

    .line 837
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-identity.ca-west-1.amazonaws.com"

    .line 838
    invoke-static {v1, v11, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-idp.ca-west-1.amazonaws.com"

    .line 840
    invoke-static {v1, v12, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "cognito-sync.ca-west-1.amazonaws.com"

    move-object/from16 v8, v17

    .line 841
    invoke-static {v1, v8, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data.iot.ca-west-1.amazonaws.com"

    .line 843
    invoke-static {v1, v13, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "dynamodb.ca-west-1.amazonaws.com"

    .line 844
    invoke-static {v1, v3, v7}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "ec2.ca-west-1.amazonaws.com"

    move-object/from16 v7, v20

    .line 845
    invoke-static {v1, v7, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "elasticloadbalancing.ca-west-1.amazonaws.com"

    .line 846
    invoke-static {v1, v14, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "firehose.ca-west-1.amazonaws.com"

    .line 848
    invoke-static {v1, v10, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "iot.ca-west-1.amazonaws.com"

    .line 849
    invoke-static {v1, v4, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "kinesis.ca-west-1.amazonaws.com"

    .line 850
    invoke-static {v1, v0, v3}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "kms.ca-west-1.amazonaws.com"

    move-object/from16 v3, v16

    .line 851
    invoke-static {v1, v3, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lambda.ca-west-1.amazonaws.com"

    move-object/from16 v3, v21

    .line 852
    invoke-static {v1, v3, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "logs.ca-west-1.amazonaws.com"

    move-object/from16 v3, v22

    .line 853
    invoke-static {v1, v3, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "polly.ca-west-1.amazonaws.com"

    .line 854
    invoke-static {v1, v9, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "s3.ca-west-1.amazonaws.com"

    .line 855
    invoke-static {v1, v2, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sdb.ca-west-1.amazonaws.com"

    .line 856
    invoke-static {v1, v6, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sns.ca-west-1.amazonaws.com"

    .line 857
    invoke-static {v1, v5, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sqs.ca-west-1.amazonaws.com"

    move-object/from16 v2, v19

    .line 858
    invoke-static {v1, v2, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sts.ca-west-1.amazonaws.com"

    .line 859
    invoke-static {v1, v15, v0}, Lcom/amazonaws/regions/RegionDefaults;->֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V

    return-object v23
.end method

.method public static ֫(Lcom/amazonaws/regions/Region;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 866
    invoke-virtual {p0}, Lcom/amazonaws/regions/Region;->ܿ()Ljava/util/HashMap;

    move-result-object v0

    .line 867
    invoke-virtual {p0}, Lcom/amazonaws/regions/Region;->֫()Ljava/util/HashMap;

    move-result-object v1

    .line 868
    invoke-virtual {p0}, Lcom/amazonaws/regions/Region;->ۧ()Ljava/util/HashMap;

    move-result-object p0

    .line 870
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 872
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
